package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.patch.RequestBody;
import org.openapijsonschematools.client.paths.fake.patch.Responses;

public class Patch {

    public static class PatchRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public PatchRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
        }
    }

    public static class PatchNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForServerIndex <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterServerIndex(PatchNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterRequestBody(PatchNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Patch0RequestBuilder {
        private final PatchNullableRequest instance;

        public Patch0RequestBuilder(PatchNullableRequest instance) {
            this.instance = instance;
        }

        public PatchRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PatchRequest(
                requestBody,
                instance.serverIndex
            );
        }
    }
    public static class PatchRequestBuilder {
        private final PatchNullableRequest instance;

        public PatchRequestBuilder() {
            this.instance = new PatchNullableRequest();
        }
    }
}
