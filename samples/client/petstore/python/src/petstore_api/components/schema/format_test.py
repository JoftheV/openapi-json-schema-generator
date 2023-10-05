# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



@dataclasses.dataclass(frozen=True)
class Integer(
    schemas.IntSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        int,
    })
    format: str = 'int'
    inclusive_maximum: typing.Union[int, float] = 100
    inclusive_minimum: typing.Union[int, float] = 10
    multiple_of: typing.Union[int, float] = 2
Int32: typing_extensions.TypeAlias = schemas.Int32Schema


@dataclasses.dataclass(frozen=True)
class Int32withValidations(
    schemas.Int32Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        int,
    })
    format: str = 'int32'
    inclusive_maximum: typing.Union[int, float] = 200
    inclusive_minimum: typing.Union[int, float] = 20
Int64: typing_extensions.TypeAlias = schemas.Int64Schema


@dataclasses.dataclass(frozen=True)
class Number(
    schemas.NumberSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    inclusive_maximum: typing.Union[int, float] = 543.2
    inclusive_minimum: typing.Union[int, float] = 32.1
    multiple_of: typing.Union[int, float] = 32.5


@dataclasses.dataclass(frozen=True)
class _Float(
    schemas.Float32Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    format: str = 'float'
    inclusive_maximum: typing.Union[int, float] = 987.6
    inclusive_minimum: typing.Union[int, float] = 54.3
Float32: typing_extensions.TypeAlias = schemas.Float32Schema


@dataclasses.dataclass(frozen=True)
class Double(
    schemas.Float64Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    format: str = 'double'
    inclusive_maximum: typing.Union[int, float] = 123.4
    inclusive_minimum: typing.Union[int, float] = 67.8
Float64: typing_extensions.TypeAlias = schemas.Float64Schema
Items: typing_extensions.TypeAlias = schemas.NumberSchema


class ArrayWithUniqueItemsTuple(
    typing.Tuple[
        typing.Union[int, float],
        ...
    ]
):

    def __new__(cls, arg: typing.Union[ArrayWithUniqueItemsTupleInput, ArrayWithUniqueItemsTuple], configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayWithUniqueItems.validate(arg, configuration=configuration)
ArrayWithUniqueItemsTupleInput = typing.Union[
    typing.List[
        typing.Union[
            int,
            float
        ],
    ],
    typing.Tuple[
        typing.Union[
            int,
            float
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class ArrayWithUniqueItems(
    schemas.Schema[schemas.immutabledict, ArrayWithUniqueItemsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    unique_items: bool = True
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayWithUniqueItemsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayWithUniqueItemsTupleInput,
            ArrayWithUniqueItemsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayWithUniqueItemsTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


@dataclasses.dataclass(frozen=True)
class String(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    pattern: schemas.PatternInfo = schemas.PatternInfo(
        pattern=r'[a-z]',  # noqa: E501
        flags=re.I,
    )
Byte: typing_extensions.TypeAlias = schemas.StrSchema
Binary: typing_extensions.TypeAlias = schemas.BinarySchema
Date: typing_extensions.TypeAlias = schemas.DateSchema
DateTime: typing_extensions.TypeAlias = schemas.DateTimeSchema
Uuid: typing_extensions.TypeAlias = schemas.UUIDSchema
UuidNoExample: typing_extensions.TypeAlias = schemas.UUIDSchema


@dataclasses.dataclass(frozen=True)
class Password(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    format: str = 'password'
    max_length: int = 64
    min_length: int = 10


@dataclasses.dataclass(frozen=True)
class PatternWithDigits(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    pattern: schemas.PatternInfo = schemas.PatternInfo(
        pattern=r'^\d{10}$'  # noqa: E501
    )


@dataclasses.dataclass(frozen=True)
class PatternWithDigitsAndDelimiter(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    pattern: schemas.PatternInfo = schemas.PatternInfo(
        pattern=r'^image_\d{1,3}$',  # noqa: E501
        flags=re.I,
    )
NoneProp: typing_extensions.TypeAlias = schemas.NoneSchema
Properties = typing.TypedDict(
    'Properties',
    {
        "integer": typing.Type[Integer],
        "int32": typing.Type[Int32],
        "int32withValidations": typing.Type[Int32withValidations],
        "int64": typing.Type[Int64],
        "number": typing.Type[Number],
        "float": typing.Type[_Float],
        "float32": typing.Type[Float32],
        "double": typing.Type[Double],
        "float64": typing.Type[Float64],
        "arrayWithUniqueItems": typing.Type[ArrayWithUniqueItems],
        "string": typing.Type[String],
        "byte": typing.Type[Byte],
        "binary": typing.Type[Binary],
        "date": typing.Type[Date],
        "dateTime": typing.Type[DateTime],
        "uuid": typing.Type[Uuid],
        "uuidNoExample": typing.Type[UuidNoExample],
        "password": typing.Type[Password],
        "pattern_with_digits": typing.Type[PatternWithDigits],
        "pattern_with_digits_and_delimiter": typing.Type[PatternWithDigitsAndDelimiter],
        "noneProp": typing.Type[NoneProp],
    }
)


class FormatTestDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "byte",
        "date",
        "number",
        "password",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "integer",
        "int32",
        "int32withValidations",
        "int64",
        "float",
        "float32",
        "double",
        "float64",
        "arrayWithUniqueItems",
        "string",
        "binary",
        "dateTime",
        "uuid",
        "uuidNoExample",
        "pattern_with_digits",
        "pattern_with_digits_and_delimiter",
        "noneProp",
    })
    
    def __new__(
        cls,
        *,
        byte: str,
        date: typing.Union[
            str,
            datetime.date
        ],
        number: typing.Union[
            int,
            float
        ],
        password: str,
        integer: typing.Union[
            int,
            schemas.Unset
        ] = schemas.unset,
        int32: typing.Union[
            int,
            schemas.Unset
        ] = schemas.unset,
        int32withValidations: typing.Union[
            int,
            schemas.Unset
        ] = schemas.unset,
        int64: typing.Union[
            int,
            schemas.Unset
        ] = schemas.unset,
        float32: typing.Union[
            int,
            float,
            schemas.Unset
        ] = schemas.unset,
        double: typing.Union[
            int,
            float,
            schemas.Unset
        ] = schemas.unset,
        float64: typing.Union[
            int,
            float,
            schemas.Unset
        ] = schemas.unset,
        arrayWithUniqueItems: typing.Union[
            ArrayWithUniqueItemsTupleInput,
            ArrayWithUniqueItemsTuple,
            schemas.Unset
        ] = schemas.unset,
        string: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        binary: typing.Union[
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.FileIO,
            schemas.Unset
        ] = schemas.unset,
        dateTime: typing.Union[
            str,
            datetime.datetime,
            schemas.Unset
        ] = schemas.unset,
        uuid: typing.Union[
            str,
            uuid.UUID,
            schemas.Unset
        ] = schemas.unset,
        uuidNoExample: typing.Union[
            str,
            uuid.UUID,
            schemas.Unset
        ] = schemas.unset,
        pattern_with_digits: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        pattern_with_digits_and_delimiter: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        noneProp: typing.Union[
            None,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "byte": byte,
            "date": date,
            "number": number,
            "password": password,
        }
        for key_, val in (
            ("integer", integer),
            ("int32", int32),
            ("int32withValidations", int32withValidations),
            ("int64", int64),
            ("float32", float32),
            ("double", double),
            ("float64", float64),
            ("arrayWithUniqueItems", arrayWithUniqueItems),
            ("string", string),
            ("binary", binary),
            ("dateTime", dateTime),
            ("uuid", uuid),
            ("uuidNoExample", uuidNoExample),
            ("pattern_with_digits", pattern_with_digits),
            ("pattern_with_digits_and_delimiter", pattern_with_digits_and_delimiter),
            ("noneProp", noneProp),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(FormatTestDictInput, arg_)
        return FormatTest.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            FormatTestDictInput,
            FormatTestDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> FormatTestDict:
        return FormatTest.validate(arg, configuration=configuration)
    
    @property
    def byte(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("byte")
        )
    
    @property
    def date(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("date")
        )
    
    @property
    def number(self) -> typing.Union[int, float]:
        return typing.cast(
            typing.Union[int, float],
            self.__getitem__("number")
        )
    
    @property
    def password(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("password")
        )
    
    @property
    def integer(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("integer", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def int32(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("int32", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def int32withValidations(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("int32withValidations", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def int64(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("int64", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def float32(self) -> typing.Union[int, float, schemas.Unset]:
        val = self.get("float32", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Union[int, float],
            val
        )
    
    @property
    def double(self) -> typing.Union[int, float, schemas.Unset]:
        val = self.get("double", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Union[int, float],
            val
        )
    
    @property
    def float64(self) -> typing.Union[int, float, schemas.Unset]:
        val = self.get("float64", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Union[int, float],
            val
        )
    
    @property
    def arrayWithUniqueItems(self) -> typing.Union[ArrayWithUniqueItemsTuple, schemas.Unset]:
        val = self.get("arrayWithUniqueItems", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            ArrayWithUniqueItemsTuple,
            val
        )
    
    @property
    def string(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("string", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def binary(self) -> typing.Union[bytes, schemas.FileIO, schemas.Unset]:
        val = self.get("binary", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Union[bytes, schemas.FileIO],
            val
        )
    
    @property
    def dateTime(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("dateTime", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def uuid(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("uuid", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def uuidNoExample(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("uuidNoExample", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def pattern_with_digits(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("pattern_with_digits", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def pattern_with_digits_and_delimiter(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("pattern_with_digits_and_delimiter", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def noneProp(self) -> typing.Union[None, schemas.Unset]:
        val = self.get("noneProp", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            None,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
FormatTestDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class FormatTest(
    schemas.Schema[FormatTestDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "byte",
        "date",
        "number",
        "password",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: FormatTestDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            FormatTestDictInput,
            FormatTestDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> FormatTestDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

