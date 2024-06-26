# UserloginGet

public class UserloginGet

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Get](#get)<br>The class that has a get method to call the endpoint |
| interface | [LoginUserOperation](#loginuseroperation)<br>The interface that has a loginUser method to call the endpoint |
| static class | [GetRequest](#getrequest)<br>The final request inputs class |
| static class | [GetNullableRequest](#getnullablerequest)<br>The initial request inputs class |
| static class | [Get0RequestBuilder](#get0requestbuilder)<br>A builder for the request input class |
| static class | [GetRequestBuilder](#getrequestbuilder)<br>A builder for the request input class |

## Get
public static class Get extends ApiClient.ApiClient1 implements GetOperation<br>

a class that allows one to call the endpoint using a method named get

### Code Sample
```
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userlogin.get.UserloginGetQueryParameters;
import org.openapijsonschematools.client.servers.RootServer0;
import org.openapijsonschematools.client.servers.RootServer1;
import org.openapijsonschematools.client.servers.RootServer2;
import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode200Response;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.UserloginGetCode200ResponseHeadersSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode400Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.userlogin.UserloginGet;
import org.openapijsonschematools.client.paths.userlogin.get.UserloginGetResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

// if you want to use a server that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfoBuilder()
    .rootServerInfo(
        new RootServerInfo.RootServerInfoBuilder()
            .rootServer0(new RootServer0())
            .build()
    )
    .build();
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfoBuilder()
    .rootServerInfoServerIndex(RootServerInfo.ServerIndex.SERVER_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator/1.0.0/java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
UserloginGet.Get apiClient = new UserloginGet.Get(apiConfiguration, schemaConfiguration);


// Map validation
UserloginGetQueryParameters.QueryParametersMap queryParameters =
    UserloginGetQueryParameters.UserloginGetQueryParameters1.validate(
    new UserloginGetQueryParameters.QueryParametersMapBuilder()
        .password("a")

        .username("a")

    .build(),
    schemaConfiguration
);

var request = new UserloginGet.GetRequestBuilder()
    .queryParameters(queryParameters)
    .build();

UserloginGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (UserloginGetCode400Response.ResponseApiException e) {
    // server returned an error response defined in the openapi document
    throw e;
} catch (ApiException e) {
    // server returned a response/contentType not defined in the openapi document
    throw e;
} catch (ValidationException e) {
    // the returned response body or header values do not conform the the schema validation requirements
    throw e;
} catch (IOException | InterruptedException e) {
    // an exception happened when making the request
    throw e;
} catch (NotImplementedException e) {
    // the request body serialization or deserialization has not yet been implemented
    // or the header content type deserialization has not yet been implemented for this contentType
    throw e;
}
UserloginGetResponses.EndpointUserloginGetCode200Response castResponse = (UserloginGetResponses.EndpointUserloginGetCode200Response) response;
if (castResponse.body instanceof UserloginGetCode200Response.ApplicationxmlResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    UserloginGetCode200Response.ApplicationjsonResponseBody deserializedBody = (UserloginGetCode200Response.ApplicationjsonResponseBody) castResponse.body;
    // handle deserialized body here
}
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Get(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetResponses.EndpointResponse](../../paths/userlogin/get/UserloginGetResponses.md#endpointresponse) | get([GetRequest](#getrequest) request) |

## LoginUserOperation
public interface LoginUserOperation<br>

an interface that allows one to call the endpoint using a method named loginUser by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetResponses.EndpointResponse](../../paths/userlogin/get/UserloginGetResponses.md#endpointresponse) | loginUser([GetRequest](#getrequest) request) |

## GetRequest
public static class GetRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [UserloginGetQueryParameters.QueryParametersMap](../../paths/userlogin/get/UserloginGetQueryParameters.md#queryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## GetNullableRequest
public static class GetNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [UserloginGetQueryParameters.@Nullable QueryParametersMap](../../paths/userlogin/get/UserloginGetQueryParameters.md#queryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| @Nullable Duration | timeout |

## Get0RequestBuilder
public static class Get0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Get0RequestBuilder(Get0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [GetRequest](#getrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Get0RequestBuilder](#get0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Get0RequestBuilder](#get0requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## GetRequestBuilder
public static class GetRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GetRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Get0RequestBuilder](#get0requestbuilder) | queryParameters([UserloginGetQueryParametersQueryParametersMap](../../paths/userlogin/get/UserloginGetQueryParameters.md#queryparametersmap) queryParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
