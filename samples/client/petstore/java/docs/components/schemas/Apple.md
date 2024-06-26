# Apple
org.openapijsonschematools.client.components.schemas.Apple.java
public class Apple<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Apple.Apple1Boxed](#apple1boxed)<br> sealed interface for validated payloads |
| record | [Apple.Apple1BoxedVoid](#apple1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Apple.Apple1BoxedMap](#apple1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Apple.Apple1](#apple1)<br> schema class |
| static class | [Apple.AppleMapBuilder](#applemapbuilder)<br> builder for Map payloads |
| static class | [Apple.AppleMap](#applemap)<br> output class for Map payloads |
| sealed interface | [Apple.OriginBoxed](#originboxed)<br> sealed interface for validated payloads |
| record | [Apple.OriginBoxedString](#originboxedstring)<br> boxed class to store validated String payloads |
| static class | [Apple.Origin](#origin)<br> schema class |
| sealed interface | [Apple.CultivarBoxed](#cultivarboxed)<br> sealed interface for validated payloads |
| record | [Apple.CultivarBoxedString](#cultivarboxedstring)<br> boxed class to store validated String payloads |
| static class | [Apple.Cultivar](#cultivar)<br> schema class |

## Apple1Boxed
public sealed interface Apple1Boxed<br>
permits<br>
[Apple1BoxedVoid](#apple1boxedvoid),
[Apple1BoxedMap](#apple1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Apple1BoxedVoid
public record Apple1BoxedVoid<br>
implements [Apple1Boxed](#apple1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Apple1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Apple1BoxedMap
public record Apple1BoxedMap<br>
implements [Apple1Boxed](#apple1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Apple1BoxedMap([AppleMap](#applemap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AppleMap](#applemap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Apple1
public static class Apple1<br>
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
import org.openapijsonschematools.client.components.schemas.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// null validation
Void validatedPayload = Apple.Apple1.validate(
    (Void) null,
    configuration
);

// Map validation
Apple.AppleMap validatedPayload =
    Apple.Apple1.validate(
    new Apple.AppleMapBuilder()
        .cultivar("IaQnEaqioxT	oASzjxaSH")

        .origin("IaQnEaqioxT	oASzjxaSH")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("cultivar", [Cultivar.class](#cultivar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("origin", [Origin.class](#origin)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"cultivar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [Apple1BoxedVoid](#apple1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AppleMap](#applemap) | validate([Map&lt;?, ?&gt;](#applemapbuilder) arg, SchemaConfiguration configuration) |
| [Apple1BoxedMap](#apple1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#applemapbuilder) arg, SchemaConfiguration configuration) |
| [Apple1Boxed](#apple1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AppleMap0Builder
public class AppleMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AppleMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AppleMap0Builder](#applemap0builder) | origin(String value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, Void value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, boolean value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, String value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, int value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, float value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, long value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, double value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, List<?> value) |
| [AppleMap0Builder](#applemap0builder) | additionalProperty(String key, Map<String, ?> value) |

## AppleMapBuilder
public class AppleMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AppleMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AppleMap0Builder](#applemap0builder) | cultivar(String value) |

## AppleMap
public static class AppleMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AppleMap](#applemap) | of([Map<String, ? extends @Nullable Object>](#applemapbuilder) arg, SchemaConfiguration configuration) |
| String | cultivar()<br> |
| String | origin()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## OriginBoxed
public sealed interface OriginBoxed<br>
permits<br>
[OriginBoxedString](#originboxedstring)

sealed interface that stores validated payloads using boxed classes

## OriginBoxedString
public record OriginBoxedString<br>
implements [OriginBoxed](#originboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OriginBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Origin
public static class Origin<br>
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
import org.openapijsonschematools.client.components.schemas.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = Apple.Origin.validate(
    "IaQnEaqioxT	oASzjxaSH",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^[A-Z\\s]*$",<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [OriginBoxedString](#originboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [OriginBoxed](#originboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CultivarBoxed
public sealed interface CultivarBoxed<br>
permits<br>
[CultivarBoxedString](#cultivarboxedstring)

sealed interface that stores validated payloads using boxed classes

## CultivarBoxedString
public record CultivarBoxedString<br>
implements [CultivarBoxed](#cultivarboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CultivarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Cultivar
public static class Cultivar<br>
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
import org.openapijsonschematools.client.components.schemas.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = Apple.Cultivar.validate(
    "IaQnEaqioxT	oASzjxaSH",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^[a-zA-Z\\s]*$"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [CultivarBoxedString](#cultivarboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [CultivarBoxed](#cultivarboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
