package org.openapijsonschematools.client.components.schemas;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.BooleanEnumValidator;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.BooleanValueMethod;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class BooleanEnum {
    // nest classes so all schemas and input/output classes can be public
    
    public enum BooleanBooleanEnumEnums implements BooleanValueMethod {
        TRUE(true);
        private final boolean value;
    
        BooleanBooleanEnumEnums(boolean value) {
            this.value = value;
        }
        public boolean value() {
            return this.value;
        }
    }
    
    
    public sealed interface BooleanEnum1Boxed permits BooleanEnum1BoxedBoolean {
        @Nullable Object getData();
    }
    
    public record BooleanEnum1BoxedBoolean(boolean data) implements BooleanEnum1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class BooleanEnum1 extends JsonSchema<BooleanEnum1Boxed> implements BooleanSchemaValidator<BooleanEnum1BoxedBoolean>, BooleanEnumValidator<BooleanBooleanEnumEnums> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable BooleanEnum1 instance = null;
    
        protected BooleanEnum1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Boolean.class))
                .enumValues(SetMaker.makeSet(
                    true
                ))
            );
        }
    
        public static BooleanEnum1 getInstance() {
            if (instance == null) {
                instance = new BooleanEnum1();
            }
            return instance;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(BooleanBooleanEnumEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public BooleanEnum1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new BooleanEnum1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public BooleanEnum1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
