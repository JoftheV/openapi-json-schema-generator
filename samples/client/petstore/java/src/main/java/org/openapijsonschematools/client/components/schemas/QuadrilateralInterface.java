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
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.SetMaker;
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
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class QuadrilateralInterface {
    // nest classes so all schemas and input/output classes can be public
    
    public enum StringShapeTypeEnums implements StringValueMethod {
        QUADRILATERAL("Quadrilateral");
        private final String value;
    
        StringShapeTypeEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface ShapeTypeBoxed permits ShapeTypeBoxedString {
        @Nullable Object getData();
    }
    
    public record ShapeTypeBoxedString(String data) implements ShapeTypeBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ShapeType extends JsonSchema<ShapeTypeBoxed> implements StringSchemaValidator<ShapeTypeBoxedString>, StringEnumValidator<StringShapeTypeEnums> {
        private static @Nullable ShapeType instance = null;
    
        protected ShapeType() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "Quadrilateral"
                ))
            );
        }
    
        public static ShapeType getInstance() {
            if (instance == null) {
                instance = new ShapeType();
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
        public String validate(StringShapeTypeEnums arg,SchemaConfiguration configuration) throws ValidationException {
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
        @Override
        public ShapeTypeBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new ShapeTypeBoxedString(validate(arg, configuration));
        }
        @Override
        public ShapeTypeBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class QuadrilateralType extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable QuadrilateralType instance = null;
        public static QuadrilateralType getInstance() {
            if (instance == null) {
                instance = new QuadrilateralType();
            }
            return instance;
        }
    }
    
    
    public static class QuadrilateralInterfaceMap extends FrozenMap<@Nullable Object> {
        protected QuadrilateralInterfaceMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "quadrilateralType",
            "shapeType"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static QuadrilateralInterfaceMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QuadrilateralInterface1.getInstance().validate(arg, configuration);
        }
        
        public String quadrilateralType() {
                        @Nullable Object value = get("quadrilateralType");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for quadrilateralType");
            }
            return (String) value;
        }
        
        public String shapeType() {
                        @Nullable Object value = get("shapeType");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for shapeType");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForQuadrilateralType <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterQuadrilateralType(Map<String, @Nullable Object> instance);
        
        default T quadrilateralType(String value) {
            var instance = getInstance();
            instance.put("quadrilateralType", value);
            return getBuilderAfterQuadrilateralType(instance);
        }
    }
    
    public interface SetterForShapeType <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterShapeType(Map<String, @Nullable Object> instance);
        
        default T shapeType(String value) {
            var instance = getInstance();
            instance.put("shapeType", value);
            return getBuilderAfterShapeType(instance);
        }
        
        default T shapeType(StringShapeTypeEnums value) {
            var instance = getInstance();
            instance.put("shapeType", value.value());
            return getBuilderAfterShapeType(instance);
        }
    }
    
    public static class QuadrilateralInterfaceMap00Builder extends UnsetAddPropsSetter<QuadrilateralInterfaceMap00Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "quadrilateralType",
            "shapeType"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public QuadrilateralInterfaceMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QuadrilateralInterfaceMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class QuadrilateralInterfaceMap01Builder implements SetterForShapeType<QuadrilateralInterfaceMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public QuadrilateralInterfaceMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QuadrilateralInterfaceMap00Builder getBuilderAfterShapeType(Map<String, @Nullable Object> instance) {
            return new QuadrilateralInterfaceMap00Builder(instance);
        }
    }
    
    public static class QuadrilateralInterfaceMap10Builder implements SetterForQuadrilateralType<QuadrilateralInterfaceMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public QuadrilateralInterfaceMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QuadrilateralInterfaceMap00Builder getBuilderAfterQuadrilateralType(Map<String, @Nullable Object> instance) {
            return new QuadrilateralInterfaceMap00Builder(instance);
        }
    }
    
    public static class QuadrilateralInterfaceMapBuilder implements SetterForQuadrilateralType<QuadrilateralInterfaceMap01Builder>, SetterForShapeType<QuadrilateralInterfaceMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public QuadrilateralInterfaceMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QuadrilateralInterfaceMap01Builder getBuilderAfterQuadrilateralType(Map<String, @Nullable Object> instance) {
            return new QuadrilateralInterfaceMap01Builder(instance);
        }
        public QuadrilateralInterfaceMap10Builder getBuilderAfterShapeType(Map<String, @Nullable Object> instance) {
            return new QuadrilateralInterfaceMap10Builder(instance);
        }
    }
    
    
    public sealed interface QuadrilateralInterface1Boxed permits QuadrilateralInterface1BoxedVoid, QuadrilateralInterface1BoxedBoolean, QuadrilateralInterface1BoxedNumber, QuadrilateralInterface1BoxedString, QuadrilateralInterface1BoxedList, QuadrilateralInterface1BoxedMap {
        @Nullable Object getData();
    }
    
    public record QuadrilateralInterface1BoxedVoid(Void data) implements QuadrilateralInterface1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record QuadrilateralInterface1BoxedBoolean(boolean data) implements QuadrilateralInterface1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record QuadrilateralInterface1BoxedNumber(Number data) implements QuadrilateralInterface1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record QuadrilateralInterface1BoxedString(String data) implements QuadrilateralInterface1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record QuadrilateralInterface1BoxedList(FrozenList<@Nullable Object> data) implements QuadrilateralInterface1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record QuadrilateralInterface1BoxedMap(QuadrilateralInterfaceMap data) implements QuadrilateralInterface1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class QuadrilateralInterface1 extends JsonSchema<QuadrilateralInterface1Boxed> implements NullSchemaValidator<QuadrilateralInterface1BoxedVoid>, BooleanSchemaValidator<QuadrilateralInterface1BoxedBoolean>, NumberSchemaValidator<QuadrilateralInterface1BoxedNumber>, StringSchemaValidator<QuadrilateralInterface1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, QuadrilateralInterface1BoxedList>, MapSchemaValidator<QuadrilateralInterfaceMap, QuadrilateralInterface1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable QuadrilateralInterface1 instance = null;
    
        protected QuadrilateralInterface1() {
            super(new JsonSchemaInfo()
                .properties(Map.ofEntries(
                    new PropertyEntry("shapeType", ShapeType.class),
                    new PropertyEntry("quadrilateralType", QuadrilateralType.class)
                ))
                .required(Set.of(
                    "quadrilateralType",
                    "shapeType"
                ))
            );
        }
    
        public static QuadrilateralInterface1 getInstance() {
            if (instance == null) {
                instance = new QuadrilateralInterface1();
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
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return newInstanceItems;
        }
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public QuadrilateralInterfaceMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new QuadrilateralInterfaceMap(castProperties);
        }
        
        public QuadrilateralInterfaceMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public QuadrilateralInterface1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new QuadrilateralInterface1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public QuadrilateralInterface1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new QuadrilateralInterface1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public QuadrilateralInterface1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new QuadrilateralInterface1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public QuadrilateralInterface1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new QuadrilateralInterface1BoxedString(validate(arg, configuration));
        }
        @Override
        public QuadrilateralInterface1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new QuadrilateralInterface1BoxedList(validate(arg, configuration));
        }
        @Override
        public QuadrilateralInterface1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new QuadrilateralInterface1BoxedMap(validate(arg, configuration));
        }
        @Override
        public QuadrilateralInterface1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
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
