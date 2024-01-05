package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.MapMaker;

public class RequiredWithEmptyArrayTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertyNotRequiredPasses() {
        // property not required
        final var schema = RequiredWithEmptyArray.RequiredWithEmptyArray1.getInstance();
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }
}
