package org.openapijsonschematools.client.components.schemas;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf {
    // nest classes so all schemas and input/output classes can be public
    
    
    public sealed interface InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed permits InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber {
        @Nullable Object getData();
    }
    
    public record InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber(Number data) implements InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1 extends JsonSchema<InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed> implements NumberSchemaValidator<InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1 instance = null;
    
        protected InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("int")
                .multipleOf(new BigDecimal("0.123456789"))
            );
        }
    
        public static InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1 getInstance() {
            if (instance == null) {
                instance = new InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
