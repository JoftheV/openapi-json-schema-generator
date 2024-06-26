# DurationFormat
org.openapijsonschematools.client.components.schemas.DurationFormat.java
class DurationFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DurationFormat.DurationFormat1Boxed](#durationformat1boxed)<br> sealed interface for validated payloads |
| data class | [DurationFormat.DurationFormat1BoxedVoid](#durationformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [DurationFormat.DurationFormat1BoxedBoolean](#durationformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [DurationFormat.DurationFormat1BoxedNumber](#durationformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [DurationFormat.DurationFormat1BoxedString](#durationformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [DurationFormat.DurationFormat1BoxedList](#durationformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [DurationFormat.DurationFormat1BoxedMap](#durationformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [DurationFormat.DurationFormat1](#durationformat1)<br> schema class |

## DurationFormat1Boxed
sealed interface DurationFormat1Boxed<br>
permits<br>
[DurationFormat1BoxedVoid](#durationformat1boxedvoid),
[DurationFormat1BoxedBoolean](#durationformat1boxedboolean),
[DurationFormat1BoxedNumber](#durationformat1boxednumber),
[DurationFormat1BoxedString](#durationformat1boxedstring),
[DurationFormat1BoxedList](#durationformat1boxedlist),
[DurationFormat1BoxedMap](#durationformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DurationFormat1BoxedVoid
data class DurationFormat1BoxedVoid<br>
implements [DurationFormat1Boxed](#durationformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DurationFormat1BoxedBoolean
data class DurationFormat1BoxedBoolean<br>
implements [DurationFormat1Boxed](#durationformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DurationFormat1BoxedNumber
data class DurationFormat1BoxedNumber<br>
implements [DurationFormat1Boxed](#durationformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DurationFormat1BoxedString
data class DurationFormat1BoxedString<br>
implements [DurationFormat1Boxed](#durationformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DurationFormat1BoxedList
data class DurationFormat1BoxedList<br>
implements [DurationFormat1Boxed](#durationformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DurationFormat1BoxedMap
data class DurationFormat1BoxedMap<br>
implements [DurationFormat1Boxed](#durationformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DurationFormat1
class DurationFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "duration"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [DurationFormat1BoxedString](#durationformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [DurationFormat1BoxedVoid](#durationformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [DurationFormat1BoxedNumber](#durationformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [DurationFormat1BoxedBoolean](#durationformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [DurationFormat1BoxedMap](#durationformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [DurationFormat1BoxedList](#durationformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [DurationFormat1Boxed](#durationformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
