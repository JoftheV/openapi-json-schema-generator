package org.openapijsonschematools.client.paths.fake.get.parameters.parameter3;
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
import org.openapijsonschematools.client.schemas.validation.DefaultValueMethod;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Schema3 {
    // nest classes so all schemas and input/output classes can be public
    
    public enum StringSchemaEnums3 implements StringValueMethod {
        LOW_LINE_ABC("_abc"),
        HYPHEN_MINUS_EFG("-efg"),
        LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS("(xyz)");
        private final String value;
    
        StringSchemaEnums3(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface Schema31Boxed permits Schema31BoxedString {
        @Nullable Object getData();
    }
    
    public record Schema31BoxedString(String data) implements Schema31Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Schema31 extends JsonSchema<Schema31Boxed> implements StringSchemaValidator<Schema31BoxedString>, StringEnumValidator<StringSchemaEnums3>, DefaultValueMethod<String> {
        private static @Nullable Schema31 instance = null;
    
        protected Schema31() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "_abc",
                    "-efg",
                    "(xyz)"
                ))
                .defaultValue("-efg")
            );
        }
    
        public static Schema31 getInstance() {
            if (instance == null) {
                instance = new Schema31();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringSchemaEnums3 arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public String defaultValue() throws ValidationException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new ValidationException("Invalid type stored in defaultValue");
        }
        @Override
        public Schema31BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new Schema31BoxedString(validate(arg, configuration));
        }
        @Override
        public Schema31Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
