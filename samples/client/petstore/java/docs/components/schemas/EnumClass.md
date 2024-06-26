# EnumClass
org.openapijsonschematools.client.components.schemas.EnumClass.java
public class EnumClass<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumClass.EnumClass1Boxed](#enumclass1boxed)<br> sealed interface for validated payloads |
| record | [EnumClass.EnumClass1BoxedString](#enumclass1boxedstring)<br> boxed class to store validated String payloads |
| static class | [EnumClass.EnumClass1](#enumclass1)<br> schema class |
| enum | [EnumClass.StringEnumClassEnums](#stringenumclassenums)<br>String enum |

## EnumClass1Boxed
public sealed interface EnumClass1Boxed<br>
permits<br>
[EnumClass1BoxedString](#enumclass1boxedstring)

sealed interface that stores validated payloads using boxed classes

## EnumClass1BoxedString
public record EnumClass1BoxedString<br>
implements [EnumClass1Boxed](#enumclass1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumClass1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EnumClass1
public static class EnumClass1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.EnumClass;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = EnumClass.EnumClass1.validate(
    "_abc",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"_abc",<br>&nbsp;&nbsp;&nbsp;&nbsp;"-efg",<br>&nbsp;&nbsp;&nbsp;&nbsp;"(xyz)",<br>&nbsp;&nbsp;&nbsp;&nbsp;"COUNT_1M",<br>&nbsp;&nbsp;&nbsp;&nbsp;"COUNT_50M"<br>)<br> |
| @Nullable Object | defaultValue = "-efg" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringEnumClassEnums](#stringenumclassenums) arg, SchemaConfiguration configuration) |
| [EnumClass1BoxedString](#enumclass1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [EnumClass1Boxed](#enumclass1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringEnumClassEnums
public enum StringEnumClassEnums<br>
extends `Enum<StringEnumClassEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| LOW_LINE_ABC | value = "_abc" |
| HYPHEN_MINUS_EFG | value = "-efg" |
| LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS | value = "(xyz)" |
| COUNT_1M | value = "COUNT_1M" |
| COUNT_50M | value = "COUNT_50M" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
