<br/>

![alt text](https://s3.eu-west-1.amazonaws.com/www.remoteflags.com/Header.png)

# remoteflags-nodejs-client
[![npm version](https://img.shields.io/npm/v/remoteflags-nodejs-client)](https://www.npmjs.com/package/remoteflags-nodejs-client)

[Remote Flags](https://www.remoteflags.com) nodejs sdk to integrate with Public API to fetch flag status.

For more information on usage checkout our [Docs](https://www.remoteflags.com/docs) page!

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.remoteflags</groupId>
  <artifactId>remoteflags-java-client</artifactId>
  <version>1.0.8</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral() // Needed if the 'remoteflags-java-client' jar has been published to maven central.
  }

  dependencies {
     implementation "com.remoteflags:remoteflags-java-client:1.0.8"
  }
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
public class Example {
  public static void main(String[] args) {
    ApiClient client = Configuration.getDefaultApiClient();
    client.setBasePath("https://api.remoteflags.com");
    
    // Configure API key authorization: RemoteFlagsAuthorizer
    ApiKeyAuth RemoteFlagsAuthorizer = (ApiKeyAuth) client.getAuthentication("RemoteFlagsAuthorizer");
    RemoteFlagsAuthorizer.setApiKey("YOUR API KEY");

    PublicApi apiInstance = new PublicApi(client);
    String ownerId = "ownerId_example"; // OwnerID to fetch status for
    String flagId = "flagId_example"; // FlagId to fetch status for
    String segment = "segment_example"; // The segment to get status from. Required for multi-segment flags. For single segment flag skip this.
    String key = "key_example"; // An identifier to be a key to associate the status with. This is used on flag which status you need to be consistent after the first random generated. For always random status behavior skip this.
    try {
      Status result = apiInstance.getStatus(ownerId, flagId, segment, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
    }
  }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.remoteflags.com*

| Class        | Method | HTTP request | Description|
|--------------| ------------- | ------------- | -------------|
| *PublicApi*  | [**devToggleIdOptions**](docs/PublicApi.md#devToggleIdOptions) | **OPTIONS** /dev-toggle/{id} | 
| *PublicApi*  | [**get1ClickStatus**](docs/PublicApi.md#get1ClickStatus) | **GET** /dev-toggle/{id} | Get a flag status for 1 click toggle.|
| *PublicApi*  | [**getFlagUsage**](docs/PublicApi.md#getFlagUsage) | **GET** /usage/owner/{ownerId}/flag/{flagId} | Get a flag usage data.|
| *PublicApi*  | [**getOwnerUsage**](docs/PublicApi.md#getOwnerUsage) | **GET** /usage/owner/{ownerId} | Get usage data for an owner.|
| *PublicApi*  | [**getStatus**](docs/PublicApi.md#getStatus) | **GET** /status/owner/{ownerId}/flag/{flagId} | Get a flag status.|
| *PublicApi*  | [**statusOwnerOwnerIdFlagFlagIdOptions**](docs/PublicApi.md#statusOwnerOwnerIdFlagFlagIdOptions) | **OPTIONS** /status/owner/{ownerId}/flag/{flagId} | 
| *PublicApi*  | [**usageOwnerOwnerIdFlagFlagIdOptions**](docs/PublicApi.md#usageOwnerOwnerIdFlagFlagIdOptions) | **OPTIONS** /usage/owner/{ownerId}/flag/{flagId} | 
|  *PublicApi* | [**usageOwnerOwnerIdOptions**](docs/PublicApi.md#usageOwnerOwnerIdOptions) | **OPTIONS** /usage/owner/{ownerId} | 


## Documentation for Models

 - [Status](docs/Status.md)
 - [Usage](docs/Usage.md)
 - [UsageRequestInner](docs/UsageRequestInner.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### RemoteFlagsAuthorizer

- **Type**: API key
- **API key parameter name**: authorizationToken
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@remoteflags.com

