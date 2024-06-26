# EnumWith0DoesNotMatchFalse
org.openapijsonschematools.client.components.schemas.EnumWith0DoesNotMatchFalse.java
public class EnumWith0DoesNotMatchFalse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1Boxed](#enumwith0doesnotmatchfalse1boxed)<br> sealed interface for validated payloads |
| record | [EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1BoxedNumber](#enumwith0doesnotmatchfalse1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1](#enumwith0doesnotmatchfalse1)<br> schema class |
| enum | [EnumWith0DoesNotMatchFalse.IntegerEnumWith0DoesNotMatchFalseEnums](#integerenumwith0doesnotmatchfalseenums)<br>Integer enum |
| enum | [EnumWith0DoesNotMatchFalse.LongEnumWith0DoesNotMatchFalseEnums](#longenumwith0doesnotmatchfalseenums)<br>Long enum |
| enum | [EnumWith0DoesNotMatchFalse.FloatEnumWith0DoesNotMatchFalseEnums](#floatenumwith0doesnotmatchfalseenums)<br>Float enum |
| enum | [EnumWith0DoesNotMatchFalse.DoubleEnumWith0DoesNotMatchFalseEnums](#doubleenumwith0doesnotmatchfalseenums)<br>Double enum |

## EnumWith0DoesNotMatchFalse1Boxed
public sealed interface EnumWith0DoesNotMatchFalse1Boxed<br>
permits<br>
[EnumWith0DoesNotMatchFalse1BoxedNumber](#enumwith0doesnotmatchfalse1boxednumber)

sealed interface that stores validated payloads using boxed classes

## EnumWith0DoesNotMatchFalse1BoxedNumber
public record EnumWith0DoesNotMatchFalse1BoxedNumber<br>
implements [EnumWith0DoesNotMatchFalse1Boxed](#enumwith0doesnotmatchfalse1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumWith0DoesNotMatchFalse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EnumWith0DoesNotMatchFalse1
public static class EnumWith0DoesNotMatchFalse1<br>
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
import org.openapijsonschematools.client.components.schemas.EnumWith0DoesNotMatchFalse;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// int validation
int validatedPayload = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;0<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| [EnumWith0DoesNotMatchFalse1BoxedNumber](#enumwith0doesnotmatchfalse1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [EnumWith0DoesNotMatchFalse1Boxed](#enumwith0doesnotmatchfalse1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## IntegerEnumWith0DoesNotMatchFalseEnums
public enum IntegerEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<IntegerEnumWith0DoesNotMatchFalseEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0 |

## LongEnumWith0DoesNotMatchFalseEnums
public enum LongEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<LongEnumWith0DoesNotMatchFalseEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0L |

## FloatEnumWith0DoesNotMatchFalseEnums
public enum FloatEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<FloatEnumWith0DoesNotMatchFalseEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0f |

## DoubleEnumWith0DoesNotMatchFalseEnums
public enum DoubleEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<DoubleEnumWith0DoesNotMatchFalseEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
