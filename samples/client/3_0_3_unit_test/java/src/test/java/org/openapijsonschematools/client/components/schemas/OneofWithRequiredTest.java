package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class OneofWithRequiredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testFirstValidValidPasses() {
        // first valid - valid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "bar",
                    2L
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothValidInvalidFails() {
        // both valid - invalid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        try {
            schema.validate(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, Long>(
                        "foo",
                        1L
                    ),
                    new AbstractMap.SimpleEntry<String, Long>(
                        "bar",
                        2L
                    ),
                    new AbstractMap.SimpleEntry<String, Long>(
                        "baz",
                        3L
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testSecondValidValidPasses() {
        // second valid - valid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "baz",
                    3L
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothInvalidInvalidFails() {
        // both invalid - invalid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        try {
            schema.validate(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "bar",
                        2L
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
