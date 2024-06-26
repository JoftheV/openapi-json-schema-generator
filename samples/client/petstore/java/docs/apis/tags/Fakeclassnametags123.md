# Fakeclassnametags123

public class Fakeclassnametags123 extends extends ApiClient implements
[FakeclassnametestPatch.ClassnameOperation](../../paths/fakeclassnametest/FakeclassnametestPatch.md#classnameoperation)

an api client class which contains all the routes for tag="fake_classname_tags 123#$%^"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeclassnametestPatchResponses.EndpointResponse](../../paths/fakeclassnametest/patch/FakeclassnametestPatchResponses.md#endpointresponse) | [classname](#classname)([FakeclassnametestPatch.PatchRequest](../../paths/fakeclassnametest/FakeclassnametestPatch.md#patchrequest) request)<br>To test class name in snake case |

## Method Detail

### classname
public [FakeclassnametestPatchResponses.EndpointResponse](../../paths/fakeclassnametest/patch/FakeclassnametestPatchResponses.md#endpointresponse) classname([FakeclassnametestPatch.PatchRequest](../../paths/fakeclassnametest/FakeclassnametestPatch.md#patchrequest) request)

To test class name in snake case

**Parameters:**<br>
request - the input request

**Returns:**<br>
the deserialized response

**Throws:**<br>
IOException, InterruptedException - an exception happened when making the request<br>
ValidationException - the returned response body or header values do not conform the the schema validation requirements<br>
NotImplementedException - the request body serialization or deserialization has not yet been implemented<br>
                          or the header content type deserialization has not yet been implemented for this contentType<br>
ApiException - server returned a response/contentType not defined in the openapi document<br>

#### Code Sample
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
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchSecurityInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchRequestBody;
import org.openapijsonschematools.client.components.schemas.Client;
import org.openapijsonschematools.client.servers.RootServer0;
import org.openapijsonschematools.client.servers.RootServer1;
import org.openapijsonschematools.client.servers.RootServer2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKeyQuery;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.responses.FakeclassnametestPatchCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.tags.Fakeclassnametags123;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKeyQuery("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .fakeclassnametestPatchSecurityRequirementObject0SecurityIndex(FakeclassnametestPatchSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator/1.0.0/java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Fakeclassnametags123 apiClient = new Fakeclassnametags123(apiConfiguration, schemaConfiguration);


Client1BoxedMap requestBodyPayload =
    Client.Client1.validateAndBox(
    new Client.ClientMapBuilder1()
        .client("a")

    .build(),
    schemaConfiguration
);
FakeclassnametestPatchRequestBody.SealedRequestBody requestBody = new FakeclassnametestPatchRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new FakeclassnametestPatch.PatchRequestBuilder()
    .requestBody(requestBody)
    .build();

FakeclassnametestPatchResponses.EndpointResponse response;
try {
    response = apiClient.patch(request);
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
FakeclassnametestPatchResponses.EndpointFakeclassnametestPatchCode200Response castResponse = (FakeclassnametestPatchResponses.EndpointFakeclassnametestPatchCode200Response) response;
FakeclassnametestPatchCode200Response.ApplicationjsonResponseBody deserializedBody = (FakeclassnametestPatchCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
