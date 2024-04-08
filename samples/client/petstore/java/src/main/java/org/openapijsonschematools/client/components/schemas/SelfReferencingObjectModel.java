package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class SelfReferencingObjectModel {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SelfReferencingObjectModelMap extends FrozenMap<@Nullable Object> {
        protected SelfReferencingObjectModelMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "selfRef"
        );
        public static SelfReferencingObjectModelMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return SelfReferencingObjectModel1.getInstance().validate(arg, configuration);
        }
        
        public SelfReferencingObjectModelMap selfRef() throws UnsetPropertyException {
            String key = "selfRef";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof SelfReferencingObjectModelMap)) {
                throw new RuntimeException("Invalid value stored for selfRef");
            }
            return (SelfReferencingObjectModelMap) value;
        }
        
        public SelfReferencingObjectModelMap getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            var value = getOrThrow(name);
            if (!(value instanceof SelfReferencingObjectModelMap)) {
                throw new RuntimeException("Invalid value stored for " + name);
            }
            return (SelfReferencingObjectModelMap) value;
        }
    }
    
    public interface SetterForSelfRef <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSelfRef(Map<String, @Nullable Object> instance);
        
        default T selfRef(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("selfRef", value);
            return getBuilderAfterSelfRef(instance);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance);
        
        default T additionalProperty(String key, Map<String, @Nullable Object> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class SelfReferencingObjectModelMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForSelfRef<SelfReferencingObjectModelMapBuilder>, SetterForAdditionalProperties<SelfReferencingObjectModelMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "selfRef"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public SelfReferencingObjectModelMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SelfReferencingObjectModelMapBuilder getBuilderAfterSelfRef(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SelfReferencingObjectModelMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface SelfReferencingObjectModel1Boxed permits SelfReferencingObjectModel1BoxedMap {
        @Nullable Object getData();
    }
    
    public record SelfReferencingObjectModel1BoxedMap(SelfReferencingObjectModelMap data) implements SelfReferencingObjectModel1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class SelfReferencingObjectModel1 extends JsonSchema<SelfReferencingObjectModel1Boxed> implements MapSchemaValidator<SelfReferencingObjectModelMap, SelfReferencingObjectModel1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable SelfReferencingObjectModel1 instance = null;
    
        protected SelfReferencingObjectModel1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("selfRef", SelfReferencingObjectModel1.class)
                ))
                .additionalProperties(SelfReferencingObjectModel1.class)
            );
        }
    
        public static SelfReferencingObjectModel1 getInstance() {
            if (instance == null) {
                instance = new SelfReferencingObjectModel1();
            }
            return instance;
        }
        
        public SelfReferencingObjectModelMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new SelfReferencingObjectModelMap(castProperties);
        }
        
        public SelfReferencingObjectModelMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public SelfReferencingObjectModel1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new SelfReferencingObjectModel1BoxedMap(validate(arg, configuration));
        }
        @Override
        public SelfReferencingObjectModel1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
