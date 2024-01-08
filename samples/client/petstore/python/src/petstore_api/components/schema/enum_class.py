# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class EnumClassEnums:

    @schemas.classproperty
    def _ABC(cls) -> typing.Literal["_abc"]:
        return EnumClass.validate("_abc")

    @schemas.classproperty
    def HYPHEN_MINUS_EFG(cls) -> typing.Literal["-efg"]:
        return EnumClass.validate("-efg")

    @schemas.classproperty
    def LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS(cls) -> typing.Literal["(xyz)"]:
        return EnumClass.validate("(xyz)")

    @schemas.classproperty
    def COUNT_1M(cls) -> typing.Literal["COUNT_1M"]:
        return EnumClass.validate("COUNT_1M")

    @schemas.classproperty
    def COUNT_50M(cls) -> typing.Literal["COUNT_50M"]:
        return EnumClass.validate("COUNT_50M")


@dataclasses.dataclass(frozen=True)
class EnumClass(
    schemas.Schema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: typing.Literal["-efg"] = "-efg"
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "_abc": "_ABC",
            "-efg": "HYPHEN_MINUS_EFG",
            "(xyz)": "LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS",
            "COUNT_1M": "COUNT_1M",
            "COUNT_50M": "COUNT_50M",
        }
    )
    enums = EnumClassEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["_abc"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["_abc"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["-efg"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["-efg"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["(xyz)"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["(xyz)"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["COUNT_1M"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["COUNT_1M"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["COUNT_50M"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["COUNT_50M"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["_abc","-efg","(xyz)","COUNT_1M","COUNT_50M",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[
        "_abc",
        "-efg",
        "(xyz)",
        "COUNT_1M",
        "COUNT_50M",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing.Literal[
                "_abc",
                "-efg",
                "(xyz)",
                "COUNT_1M",
                "COUNT_50M",
            ],
            validated_arg
        )
