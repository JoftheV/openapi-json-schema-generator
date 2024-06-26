package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ItemsWithNullInstanceElements {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends NullJsonSchema.NullJsonSchema1 {
        private static @Nullable Items instance = null;
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
    }
    
    
    public static class ItemsWithNullInstanceElementsList extends FrozenList<Void> {
        protected ItemsWithNullInstanceElementsList(FrozenList<Void> m) {
            super(m);
        }
        public static ItemsWithNullInstanceElementsList of(List<Void> arg, SchemaConfiguration configuration) throws ValidationException {
            return ItemsWithNullInstanceElements1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsWithNullInstanceElementsListBuilder {
        // class to build List<Void>
        private final List<Void> list;
    
        public ItemsWithNullInstanceElementsListBuilder() {
            list = new ArrayList<>();
        }
    
        public ItemsWithNullInstanceElementsListBuilder(List<Void> list) {
            this.list = list;
        }
        
        public ItemsWithNullInstanceElementsListBuilder add(Void item) {
            list.add(null);
            return this;
        }
    
        public List<Void> build() {
            return list;
        }
    }
    
    
    public sealed interface ItemsWithNullInstanceElements1Boxed permits ItemsWithNullInstanceElements1BoxedList {
        @Nullable Object getData();
    }
    
    public record ItemsWithNullInstanceElements1BoxedList(ItemsWithNullInstanceElementsList data) implements ItemsWithNullInstanceElements1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ItemsWithNullInstanceElements1 extends JsonSchema<ItemsWithNullInstanceElements1Boxed> implements ListSchemaValidator<ItemsWithNullInstanceElementsList, ItemsWithNullInstanceElements1BoxedList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ItemsWithNullInstanceElements1 instance = null;
    
        protected ItemsWithNullInstanceElements1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
            );
        }
    
        public static ItemsWithNullInstanceElements1 getInstance() {
            if (instance == null) {
                instance = new ItemsWithNullInstanceElements1();
            }
            return instance;
        }
        
        @Override
        public ItemsWithNullInstanceElementsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Void> items = new ArrayList<>();
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
                if (!(itemInstance == null || itemInstance instanceof Void)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((Void) itemInstance);
                i += 1;
            }
            FrozenList<Void> newInstanceItems = new FrozenList<>(items);
            return new ItemsWithNullInstanceElementsList(newInstanceItems);
        }
        
        public ItemsWithNullInstanceElementsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ItemsWithNullInstanceElements1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ItemsWithNullInstanceElements1BoxedList(validate(arg, configuration));
        }
        @Override
        public ItemsWithNullInstanceElements1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
