/*
 * Remote Flags API
 * Remote Flags openapi definition. Public readonly API for integration with Remote Flags.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@remoteflags.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.remoteflags.api;

import com.remoteflags.ApiCallback;
import com.remoteflags.ApiClient;
import com.remoteflags.ApiException;
import com.remoteflags.ApiResponse;
import com.remoteflags.Configuration;
import com.remoteflags.Pair;
import com.remoteflags.ProgressRequestBody;
import com.remoteflags.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.remoteflags.model.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicApi {
    private ApiClient localVarApiClient;

    public PublicApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getStatus
     * @param ownerId OwnerID to fetch status for (required)
     * @param flagId FlagId to fetch status for (required)
     * @param segment The segment to get status from. Required for multi-segment flags. For single segment flag skip this. (optional)
     * @param key An identifier to be a key to associate the status with. This is used on flag which status you need to be consistent after the first random generated. For always random status behavior skip this. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatusCall(String ownerId, String flagId, String segment, String key, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/status/owner/{ownerId}/flag/{flagId}"
            .replaceAll("\\{" + "ownerId" + "\\}", localVarApiClient.escapeString(ownerId.toString()))
            .replaceAll("\\{" + "flagId" + "\\}", localVarApiClient.escapeString(flagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (segment != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("segment", segment));
        }

        if (key != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("key", key));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "RemoteFlagsAuthorizer" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatusValidateBeforeCall(String ownerId, String flagId, String segment, String key, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new ApiException("Missing the required parameter 'ownerId' when calling getStatus(Async)");
        }
        
        // verify the required parameter 'flagId' is set
        if (flagId == null) {
            throw new ApiException("Missing the required parameter 'flagId' when calling getStatus(Async)");
        }
        

        okhttp3.Call localVarCall = getStatusCall(ownerId, flagId, segment, key, _callback);
        return localVarCall;

    }

    /**
     * Get a flag status.
     * Use this operation to get a flag status from remoteflags.
     * @param ownerId OwnerID to fetch status for (required)
     * @param flagId FlagId to fetch status for (required)
     * @param segment The segment to get status from. Required for multi-segment flags. For single segment flag skip this. (optional)
     * @param key An identifier to be a key to associate the status with. This is used on flag which status you need to be consistent after the first random generated. For always random status behavior skip this. (optional)
     * @return Status
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public Status getStatus(String ownerId, String flagId, String segment, String key) throws ApiException {
        ApiResponse<Status> localVarResp = getStatusWithHttpInfo(ownerId, flagId, segment, key);
        return localVarResp.getData();
    }

    /**
     * Get a flag status.
     * Use this operation to get a flag status from remoteflags.
     * @param ownerId OwnerID to fetch status for (required)
     * @param flagId FlagId to fetch status for (required)
     * @param segment The segment to get status from. Required for multi-segment flags. For single segment flag skip this. (optional)
     * @param key An identifier to be a key to associate the status with. This is used on flag which status you need to be consistent after the first random generated. For always random status behavior skip this. (optional)
     * @return ApiResponse&lt;Status&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Status> getStatusWithHttpInfo(String ownerId, String flagId, String segment, String key) throws ApiException {
        okhttp3.Call localVarCall = getStatusValidateBeforeCall(ownerId, flagId, segment, key, null);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a flag status. (asynchronously)
     * Use this operation to get a flag status from remoteflags.
     * @param ownerId OwnerID to fetch status for (required)
     * @param flagId FlagId to fetch status for (required)
     * @param segment The segment to get status from. Required for multi-segment flags. For single segment flag skip this. (optional)
     * @param key An identifier to be a key to associate the status with. This is used on flag which status you need to be consistent after the first random generated. For always random status behavior skip this. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatusAsync(String ownerId, String flagId, String segment, String key, final ApiCallback<Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStatusValidateBeforeCall(ownerId, flagId, segment, key, _callback);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
