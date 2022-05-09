# PublicApi

All URIs are relative to *https://api.remoteflags.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFlagUsage**](PublicApi.md#getFlagUsage) | **GET** /usage/owner/{ownerId}/flag/{flagId} | Get a flag usage data.
[**getOwnerUsage**](PublicApi.md#getOwnerUsage) | **GET** /usage/owner/{ownerId} | Get usage data for an owner.
[**getStatus**](PublicApi.md#getStatus) | **GET** /status/owner/{ownerId}/flag/{flagId} | Get a flag status.
[**statusOwnerOwnerIdFlagFlagIdOptions**](PublicApi.md#statusOwnerOwnerIdFlagFlagIdOptions) | **OPTIONS** /status/owner/{ownerId}/flag/{flagId} | 
[**usageOwnerOwnerIdFlagFlagIdOptions**](PublicApi.md#usageOwnerOwnerIdFlagFlagIdOptions) | **OPTIONS** /usage/owner/{ownerId}/flag/{flagId} | 
[**usageOwnerOwnerIdOptions**](PublicApi.md#usageOwnerOwnerIdOptions) | **OPTIONS** /usage/owner/{ownerId} | 


<a name="getFlagUsage"></a>
# **getFlagUsage**
> Usage getFlagUsage(ownerId, flagId, year, month)

Get a flag usage data.

Use this operation to get flag usage data from remoteflags.

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
    String ownerId = "ownerId_example"; // String | OwnerID to fetch usage for
    String flagId = "flagId_example"; // String | FlagId to fetch usage for
    Integer year = 56; // Integer | Year to get usage from. If skipped, will get all usage.
    Integer month = 56; // Integer | Month to get usage from. If skipped, will get yearly usage.
    try {
      Usage result = apiInstance.getFlagUsage(ownerId, flagId, year, month);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFlagUsage");
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
 **ownerId** | **String**| OwnerID to fetch usage for |
 **flagId** | **String**| FlagId to fetch usage for |
 **year** | **Integer**| Year to get usage from. If skipped, will get all usage. | [optional]
 **month** | **Integer**| Month to get usage from. If skipped, will get yearly usage. | [optional]

### Return type

[**Usage**](Usage.md)

### Authorization

[RemoteFlagsAuthorizer](../README.md#RemoteFlagsAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | 400 response |  * Access-Control-Allow-Origin -  <br>  |
**500** | 500 response |  * Access-Control-Allow-Origin -  <br>  |
**200** | 200 response |  * Access-Control-Allow-Origin -  <br>  |

<a name="getOwnerUsage"></a>
# **getOwnerUsage**
> Usage getOwnerUsage(ownerId, year, month)

Get usage data for an owner.

Use this operation to get owner usage data from remoteflags.

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
    String ownerId = "ownerId_example"; // String | OwnerID to fetch usage for
    Integer year = 56; // Integer | Year to get usage from. If skipped, will get all usage.
    Integer month = 56; // Integer | Month to get usage from. If skipped, will get yearly usage.
    try {
      Usage result = apiInstance.getOwnerUsage(ownerId, year, month);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getOwnerUsage");
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
 **ownerId** | **String**| OwnerID to fetch usage for |
 **year** | **Integer**| Year to get usage from. If skipped, will get all usage. | [optional]
 **month** | **Integer**| Month to get usage from. If skipped, will get yearly usage. | [optional]

### Return type

[**Usage**](Usage.md)

### Authorization

[RemoteFlagsAuthorizer](../README.md#RemoteFlagsAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | 400 response |  * Access-Control-Allow-Origin -  <br>  |
**500** | 500 response |  * Access-Control-Allow-Origin -  <br>  |
**200** | 200 response |  * Access-Control-Allow-Origin -  <br>  |

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
**400** | 400 response |  * Access-Control-Allow-Origin -  <br>  |
**500** | 500 response |  * Access-Control-Allow-Origin -  <br>  |
**200** | 200 response |  * Access-Control-Allow-Origin -  <br>  |

<a name="statusOwnerOwnerIdFlagFlagIdOptions"></a>
# **statusOwnerOwnerIdFlagFlagIdOptions**
> Object statusOwnerOwnerIdFlagFlagIdOptions(ownerId, flagId)



### Example
```java
// Import classes:
import com.remoteflags.ApiClient;
import com.remoteflags.ApiException;
import com.remoteflags.Configuration;
import com.remoteflags.models.*;
import com.remoteflags.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.remoteflags.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String ownerId = "ownerId_example"; // String | 
    String flagId = "flagId_example"; // String | 
    try {
      Object result = apiInstance.statusOwnerOwnerIdFlagFlagIdOptions(ownerId, flagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#statusOwnerOwnerIdFlagFlagIdOptions");
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
 **ownerId** | **String**|  |
 **flagId** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 200 response |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a name="usageOwnerOwnerIdFlagFlagIdOptions"></a>
# **usageOwnerOwnerIdFlagFlagIdOptions**
> Object usageOwnerOwnerIdFlagFlagIdOptions(ownerId, flagId)



### Example
```java
// Import classes:
import com.remoteflags.ApiClient;
import com.remoteflags.ApiException;
import com.remoteflags.Configuration;
import com.remoteflags.models.*;
import com.remoteflags.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.remoteflags.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String ownerId = "ownerId_example"; // String | 
    String flagId = "flagId_example"; // String | 
    try {
      Object result = apiInstance.usageOwnerOwnerIdFlagFlagIdOptions(ownerId, flagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#usageOwnerOwnerIdFlagFlagIdOptions");
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
 **ownerId** | **String**|  |
 **flagId** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 200 response |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a name="usageOwnerOwnerIdOptions"></a>
# **usageOwnerOwnerIdOptions**
> Object usageOwnerOwnerIdOptions(ownerId)



### Example
```java
// Import classes:
import com.remoteflags.ApiClient;
import com.remoteflags.ApiException;
import com.remoteflags.Configuration;
import com.remoteflags.models.*;
import com.remoteflags.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.remoteflags.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String ownerId = "ownerId_example"; // String | 
    try {
      Object result = apiInstance.usageOwnerOwnerIdOptions(ownerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#usageOwnerOwnerIdOptions");
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
 **ownerId** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 200 response |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

