package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

record ArrayWithItemsSchema(LinkedHashSet<Class<?>> type, Class<?> items) implements Schema {
    public static ArrayWithItemsSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        // can't use ImmutableList because it does not allow null values in entries
        // can't use Collections.unmodifiableList because Collections.UnmodifiableList is not public + extensible
        type.add(FrozenList.class);
        Class<?> items = StringSchema.class;
        return new ArrayWithItemsSchema(type, items);
    }

    public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(ArrayWithItemsSchema.class, arg, configuration);
    }
}

public class ArrayTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> Schema.validate(
                ArrayWithItemsSchema.class, (Void) null, configuration
        ));
    }

    @Test
    public void testValidateArrayWithItemsSchema() {
        // map with only item works
        List<Object> inList = new ArrayList<>();
        inList.add("abc");
        FrozenList<Object> validatedValue = ArrayWithItemsSchema.validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // map with no items works
        inList = new ArrayList<>();
        validatedValue = ArrayWithItemsSchema.validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid prop type fails
        inList = new ArrayList<>();
        inList.add(1);
        List<Object> finalInList = inList;
        Assert.assertThrows(RuntimeException.class, () -> ArrayWithItemsSchema.validate(
                finalInList, configuration
        ));
    }
}
