# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

JustNumber: typing_extensions.TypeAlias = schemas.NumberSchema
Properties = typing.TypedDict(
    'Properties',
    {
        "JustNumber": typing.Type[JustNumber],
    }
)


class NumberOnlyDict(schemas.immutabledict[str, typing.Union[int, float]]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "JustNumber",
    })
    
    def __new__(
        cls,
        *,
        JustNumber: typing.Union[
            int,
            float,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("JustNumber", JustNumber),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(NumberOnlyDictInput, arg_)
        return NumberOnly.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            NumberOnlyDictInput,
            NumberOnlyDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> NumberOnlyDict:
        return NumberOnly.validate(arg, configuration=configuration)
    
    @property
    def JustNumber(self) -> typing.Union[int, float, schemas.Unset]:
        val = self.get("JustNumber", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return val
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
NumberOnlyDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class NumberOnly(
    schemas.Schema[NumberOnlyDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: NumberOnlyDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            NumberOnlyDictInput,
            NumberOnlyDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> NumberOnlyDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

