# PublicApi

All URIs are relative to *https://api.remoteflags.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](PublicApi.md#getStatus) | **GET** /status/owner/{ownerId}/flag/{flagId} | Get a flag status.


<a name="getStatus"></a>
# **getStatus**
> Status getStatus(ownerId, flagId, segment, key)

Get a flag status.

Use this operation to get a flag status from remoteflags.

### Example
```java
// Import classes:
import com.remoteflags.ApiClient;
import com.remoteflags.ApiException;
import com.remoteflags.Configuration;
import com.remoteflags.auth.*;
import com.remoteflags.models.*;
import com.remoteflags.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.remoteflags.com");
    
    // Configure API key authorization: RemoteFlagsAuthorizer
    ApiKeyAuth RemoteFlagsAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("RemoteFlagsAuthorizer");
    RemoteFlagsAuthorizer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //RemoteFlagsAuthorizer.setApiKeyPrefix("Token");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String ownerId = "ownerId_example"; // String | OwnerID to fetch status for
    String flagId = "flagId_example"; // String | FlagId to fetch status for
    String segment = "segment_example"; // String | The segment to get status from. Required for multi-segment flags. For single segment flag skip this.
    String key = "key_example"; // String | An identifier to be a key to associate the status with. This is used on flag which status you need to be consistent after the first random generated. For always random status behavior skip this.
    try {
      Status result = apiInstance.getStatus(ownerId, flagId, segment, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownerId** | **String**| OwnerID to fetch status for |
 **flagId** | **String**| FlagId to fetch status for |
 **segment** | **String**| The segment to get status from. Required for multi-segment flags. For single segment flag skip this. | [optional]
 **key** | **String**| An identifier to be a key to associate the status with. This is used on flag which status you need to be consistent after the first random generated. For always random status behavior skip this. | [optional]

### Return type

[**Status**](Status.md)

### Authorization

[RemoteFlagsAuthorizer](../README.md#RemoteFlagsAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | 400 Invalid input |  -  |
**500** | 500 Internal Server error |  -  |
**200** | 200 OK |  -  |

