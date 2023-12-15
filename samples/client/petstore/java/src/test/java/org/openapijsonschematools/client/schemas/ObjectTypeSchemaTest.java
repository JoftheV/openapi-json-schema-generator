package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class ObjectTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    public static class ObjectWithPropsSchema extends JsonSchema implements MapSchemaValidator<Object, Object, FrozenMap<Object>> {
        private static ObjectWithPropsSchema instance;
        private ObjectWithPropsSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(FrozenMap.class))
                .properties(Map.ofEntries(
                        new PropertyEntry("someString", StringJsonSchema.class)
                ))
            );

        }

        public static ObjectWithPropsSchema getInstance() {
            if (instance == null) {
                instance = new ObjectWithPropsSchema();
            }
            return instance;
        }

        @Override
        public FrozenMap<Object> castToAllowedTypes(Map<String, Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedMapTypes(arg, pathToItem, pathSet);
        }

        @Override
        public FrozenMap<Object> getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }

        @Override
        public FrozenMap<Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

    public static class ObjectWithAddpropsSchema extends JsonSchema implements MapSchemaValidator<String, String, FrozenMap<String>> {
        private static ObjectWithAddpropsSchema instance;
        private ObjectWithAddpropsSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(FrozenMap.class))
                .additionalProperties(StringJsonSchema.class)
            );
        }

        public static ObjectWithAddpropsSchema getInstance() {
            if (instance == null) {
                instance = new ObjectWithAddpropsSchema();
            }
            return instance;
        }

        @Override
        public FrozenMap<String> castToAllowedTypes(Map<String, String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, String> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, String> entry: arg.entrySet()) {
                String key = entry.getKey();
                String val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                String fixedVal = StringJsonSchema.getInstance().castToAllowedTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }

        @Override
        public FrozenMap<String> getNewInstance(FrozenMap<String> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }

        @Override
        public FrozenMap<String> validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<String> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<String> castArg = (FrozenMap<String>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

    public static class ObjectWithPropsAndAddpropsSchema extends JsonSchema implements MapSchemaValidator<Object, Object, FrozenMap<Object>> {
        private static ObjectWithPropsAndAddpropsSchema instance;
        private ObjectWithPropsAndAddpropsSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(FrozenMap.class))
                .properties(Map.ofEntries(
                        new PropertyEntry("someString", StringJsonSchema.class)
                ))
                .additionalProperties(BooleanJsonSchema.class)
            );
        }

        public static ObjectWithPropsAndAddpropsSchema getInstance() {
            if (instance == null) {
                instance = new ObjectWithPropsAndAddpropsSchema();
            }
            return instance;
        }

        @Override
        public FrozenMap<Object> castToAllowedTypes(Map<String, Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedMapTypes(arg, pathToItem, pathSet);
        }

        @Override
        public FrozenMap<Object> getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }

        @Override
        public FrozenMap<Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

    public static class ObjectWithOutputTypeSchemaMap extends FrozenMap<Object> {
        ObjectWithOutputTypeSchemaMap(FrozenMap<Object> m) {
            super(m);
        }

        public static ObjectWithOutputTypeSchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ObjectWithOutputTypeSchema.getInstance().validate(arg, configuration);
        }
    }


    public static class ObjectWithOutputTypeSchema extends JsonSchema implements MapSchemaValidator<Object, Object, ObjectWithOutputTypeSchemaMap> {
        private static ObjectWithOutputTypeSchema instance;
        public ObjectWithOutputTypeSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(FrozenMap.class))
                .properties(Map.ofEntries(
                        new PropertyEntry("someString", StringJsonSchema.class)
                ))
            );
        }

        public static ObjectWithOutputTypeSchema getInstance() {
            if (instance == null) {
                instance = new ObjectWithOutputTypeSchema();
            }
            return instance;
        }

        @Override
        public FrozenMap<Object> castToAllowedTypes(Map<String, Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedMapTypes(arg, pathToItem, pathSet);
        }

        @Override
        public ObjectWithOutputTypeSchemaMap getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return new ObjectWithOutputTypeSchemaMap(arg);
        }

        @Override
        public ObjectWithOutputTypeSchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        ObjectWithPropsSchema schema = ObjectWithPropsSchema.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                schema,
                null,
                validationMetadata
        ));
    }

    @Test
    public void testValidateObjectWithPropsSchema() {
        ObjectWithPropsSchema schema = ObjectWithPropsSchema.getInstance();

        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<Object> validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional unvalidated property works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> finalInMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                finalInMap, configuration
        ));
    }

    @Test
    public void testValidateObjectWithAddpropsSchema() {
        ObjectWithAddpropsSchema schema = ObjectWithAddpropsSchema.getInstance();

        // map with only property works
        Map<String, String> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<String> validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional properties works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid addProp type fails
        Map<String, Integer> invalidInput = Map.of("someString", 1);
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                schema,
                invalidInput,
                validationMetadata
        ));
    }

    @Test
    public void testValidateObjectWithPropsAndAddpropsSchema() {
        ObjectWithPropsAndAddpropsSchema schema = ObjectWithPropsAndAddpropsSchema.getInstance();

        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<Object> validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, Object> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional properties works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someAddProp", true);
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someAddProp", true);
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> invalidPropMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                invalidPropMap, configuration
        ));

        // invalid addProp type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someAddProp", 1);
        Map<String, Object> invalidAddpropMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                invalidAddpropMap, configuration
        ));
    }

    @Test
    public void testValidateObjectWithOutputTypeSchema() {
        ObjectWithOutputTypeSchema schema = ObjectWithOutputTypeSchema.getInstance();

        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        ObjectWithOutputTypeSchemaMap validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional unvalidated property works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> finalInMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                finalInMap, configuration
        ));

        // using output class directly works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        validatedValue = ObjectWithOutputTypeSchemaMap.of(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);
    }
}
