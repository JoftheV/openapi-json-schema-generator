package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.put.PathParameters;
import org.openapijsonschematools.client.paths.userusername.put.RequestBody;
import org.openapijsonschematools.client.paths.userusername.put.Parameters;
import org.openapijsonschematools.client.paths.userusername.put.Responses;

public class Put {
    public static class PutCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PathParameters.@Nullable PathParameters1 pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
    }

    public interface SetterForServerIndex <T> {
        PutCallData getInstance();
        T getBuilderAfterServerIndex(PutCallData instance);
        default T serverIndex(ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        PutCallData getInstance();
        T getBuilderAfterPathParameters(PutCallData instance);
        default T pathParameters(PathParameters1 pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PutCallData getInstance();
        T getBuilderAfterRequestBody(PutCallData instance);
        default T requestBody(SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Put00RequestBuilder {
        private final PutCallData instance;

        public Put00RequestBuilderPutCallData instance) {
            this.instance = instance;
        }
    }
    public static class Put01RequestBuilder {
        private final PutCallData instance;

        public Put01RequestBuilderPutCallData instance) {
            this.instance = instance;
        }
    }
    public static class PutRequestBuilder {
        private final PutCallData instance;

        public PutRequestBuilder() {
            this.instance = new PutCallData();
        }
    }
}
