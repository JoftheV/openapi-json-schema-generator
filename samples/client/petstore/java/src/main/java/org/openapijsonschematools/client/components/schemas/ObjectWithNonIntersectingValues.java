package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectWithNonIntersectingValues {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends StringJsonSchema {}
    
    
    public static class A extends NumberJsonSchema {}
    
    
    public static class ObjectWithNonIntersectingValuesMap extends FrozenMap<Object> {
        ObjectWithNonIntersectingValuesMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "a"
        );
        public static ObjectWithNonIntersectingValuesMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithNonIntersectingValues1.getInstance().validate(arg, configuration);
        }
        
        public Number a() {
            String key = "a";
            throwIfKeyNotPresent(key);
            return (Number) get(key);
        }
        
        public String getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return (String) get(name);
        }
    }
    public static class ObjectWithNonIntersectingValuesMapInput {
        // optionalProperties + additionalProperties
    }
    
    
    public static class ObjectWithNonIntersectingValues1 extends JsonSchema implements MapSchemaValidator<Object, ObjectWithNonIntersectingValuesMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static ObjectWithNonIntersectingValues1 instance;
    
        protected ObjectWithNonIntersectingValues1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("a", A.class)
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static ObjectWithNonIntersectingValues1 getInstance() {
            if (instance == null) {
                instance = new ObjectWithNonIntersectingValues1();
            }
            return instance;
        }
        
        public ObjectWithNonIntersectingValuesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                String propertyName = (String) entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new ObjectWithNonIntersectingValuesMap(castProperties);
        }
        
        @Override
        public ObjectWithNonIntersectingValuesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
