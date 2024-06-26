package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAlwaysInvalidButNaiveImplementationsMayRaiseAnOverflowErrorFails() {
        // always invalid, but naive implementations may raise an overflow error
        final var schema = InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.getInstance();
        try {
            schema.validate(
                1.0E308d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testValidIntegerWithMultipleofFloatPasses() throws ValidationException {
        // valid integer with multipleOf float
        final var schema = InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.getInstance();
        schema.validate(
            123456789,
            configuration
        );
    }
}
