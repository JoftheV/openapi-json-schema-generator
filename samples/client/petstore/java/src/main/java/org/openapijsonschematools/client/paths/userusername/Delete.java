package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.delete.PathParameters;
import org.openapijsonschematools.client.paths.userusername.delete.Parameters;
import org.openapijsonschematools.client.paths.userusername.delete.Responses;

public class Delete {
    public static class DeleteCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }

    public static class Delete0RequestBuilder {
        private final DeleteCallData instance;

        public Delete0RequestBuilderDeleteCallData instance) {
            this.instance = instance;
        }
    }
    public static class DeleteRequestBuilder {
        private final DeleteCallData instance;

        public DeleteRequestBuilder() {
            this.instance = new DeleteCallData();
        }
    }
}
