package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.IntJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ASchemaGivenForPrefixitems {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ASchemaGivenForPrefixitemsList extends FrozenList<@Nullable Object> {
        protected ASchemaGivenForPrefixitemsList(FrozenList<@Nullable Object> m) {
            super(m);
        }
        public static ASchemaGivenForPrefixitemsList of(List<? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ASchemaGivenForPrefixitems1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ASchemaGivenForPrefixitemsListBuilder {
        // class to build List<@Nullable Object>
        private final List<@Nullable Object> list;
    
        public ASchemaGivenForPrefixitemsListBuilder() {
            list = new ArrayList<>();
        }
    
        public ASchemaGivenForPrefixitemsListBuilder(List<@Nullable Object> list) {
            this.list = list;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(Void item) {
            list.add(null);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(boolean item) {
            list.add(item);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(String item) {
            list.add(item);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(int item) {
            list.add(item);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(float item) {
            list.add(item);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(long item) {
            list.add(item);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(double item) {
            list.add(item);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(List<?> item) {
            list.add(item);
            return this;
        }
        
        public ASchemaGivenForPrefixitemsListBuilder add(Map<String, ?> item) {
            list.add(item);
            return this;
        }
    
        public List<@Nullable Object> build() {
            return list;
        }
    }
    
    
    public static class Schema0 extends IntJsonSchema.IntJsonSchema1 {
        private static @Nullable Schema0 instance = null;
        public static Schema0 getInstance() {
            if (instance == null) {
                instance = new Schema0();
            }
            return instance;
        }
    }
    
    
    public static class Schema1 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
    
    
    public sealed interface ASchemaGivenForPrefixitems1Boxed permits ASchemaGivenForPrefixitems1BoxedVoid, ASchemaGivenForPrefixitems1BoxedBoolean, ASchemaGivenForPrefixitems1BoxedNumber, ASchemaGivenForPrefixitems1BoxedString, ASchemaGivenForPrefixitems1BoxedList, ASchemaGivenForPrefixitems1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ASchemaGivenForPrefixitems1BoxedVoid(Void data) implements ASchemaGivenForPrefixitems1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ASchemaGivenForPrefixitems1BoxedBoolean(boolean data) implements ASchemaGivenForPrefixitems1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ASchemaGivenForPrefixitems1BoxedNumber(Number data) implements ASchemaGivenForPrefixitems1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ASchemaGivenForPrefixitems1BoxedString(String data) implements ASchemaGivenForPrefixitems1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ASchemaGivenForPrefixitems1BoxedList(ASchemaGivenForPrefixitemsList data) implements ASchemaGivenForPrefixitems1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ASchemaGivenForPrefixitems1BoxedMap(FrozenMap<@Nullable Object> data) implements ASchemaGivenForPrefixitems1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ASchemaGivenForPrefixitems1 extends JsonSchema<ASchemaGivenForPrefixitems1Boxed> implements NullSchemaValidator<ASchemaGivenForPrefixitems1BoxedVoid>, BooleanSchemaValidator<ASchemaGivenForPrefixitems1BoxedBoolean>, NumberSchemaValidator<ASchemaGivenForPrefixitems1BoxedNumber>, StringSchemaValidator<ASchemaGivenForPrefixitems1BoxedString>, ListSchemaValidator<ASchemaGivenForPrefixitemsList, ASchemaGivenForPrefixitems1BoxedList>, MapSchemaValidator<FrozenMap<@Nullable Object>, ASchemaGivenForPrefixitems1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ASchemaGivenForPrefixitems1 instance = null;
    
        protected ASchemaGivenForPrefixitems1() {
            super(new JsonSchemaInfo()
                .prefixItems(List.of(
                    Schema0.class,
                    Schema1.class
                ))
            );
        }
    
        public static ASchemaGivenForPrefixitems1 getInstance() {
            if (instance == null) {
                instance = new ASchemaGivenForPrefixitems1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public ASchemaGivenForPrefixitemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable Object> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return new ASchemaGivenForPrefixitemsList(newInstanceItems);
        }
        
        public ASchemaGivenForPrefixitemsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new RuntimeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ASchemaGivenForPrefixitems1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new ASchemaGivenForPrefixitems1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public ASchemaGivenForPrefixitems1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new ASchemaGivenForPrefixitems1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public ASchemaGivenForPrefixitems1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new ASchemaGivenForPrefixitems1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public ASchemaGivenForPrefixitems1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new ASchemaGivenForPrefixitems1BoxedString(validate(arg, configuration));
        }
        @Override
        public ASchemaGivenForPrefixitems1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ASchemaGivenForPrefixitems1BoxedList(validate(arg, configuration));
        }
        @Override
        public ASchemaGivenForPrefixitems1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ASchemaGivenForPrefixitems1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ASchemaGivenForPrefixitems1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
