package org.openapijsonschematools.client.paths.pet.put.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;

import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class PetPutCode405Response {

    public static class PetPutCode405Response1 extends ResponseDeserializer<Void, Void, Void> {
        public PetPutCode405Response1() {
            super(
                MapUtils.makeMap(
                )
            );
        }

        @Override
        protected Void getBody(String contentType, Void mediaType, byte[] body, SchemaConfiguration configuration) {
            return null;
        }

        @Override
        protected Void getHeaders(HttpHeaders headers, SchemaConfiguration configuration) {
            return null;
        }
    }

    @SuppressWarnings("serial")
    public static class ResponseApiException extends ApiException {
        public DeserializedHttpResponse<Void, Void> deserializedResponse;

        public ResponseApiException(String s, HttpResponse<byte[]> response, DeserializedHttpResponse<Void, Void> deserializedResponse) {
            super(s, response);
            this.deserializedResponse = deserializedResponse;
        }
    }
}
