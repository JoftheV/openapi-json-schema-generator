package org.openapijsonschematools.client.paths.petpetid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetid.delete.HeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PathParameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Parameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Responses;

public class Delete {
    public static class DeleteCallData {
        public HeaderParameters.@Nullable HeaderParameters1 headerParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetidDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
        public PathParameters.@Nullable PathParameters1 pathParameters;
    }

    public interface SetterForHeaderParameters <T> {
        DeleteCallData getInstance();
        T getBuilderAfterHeaderParameters(DeleteCallData instance);
        default T headerParameters(HeaderParameters1 headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        DeleteCallData getInstance();
        T getBuilderAfterServerIndex(DeleteCallData instance);
        default T serverIndex(ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        DeleteCallData getInstance();
        T getBuilderAfterSecurityIndex(DeleteCallData instance);
        default T securityIndex(SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        DeleteCallData getInstance();
        T getBuilderAfterPathParameters(DeleteCallData instance);
        default T pathParameters(PathParameters1 pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
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
