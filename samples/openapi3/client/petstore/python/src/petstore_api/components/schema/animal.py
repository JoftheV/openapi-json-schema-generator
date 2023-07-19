# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

ClassName: typing_extensions.TypeAlias = schemas.StrSchema


@dataclasses.dataclass(frozen=True)
class Color(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: str = "red"
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "className": typing.Type[ClassName],
        "color": typing.Type[Color],
    }
)


class AnimalDict(schemas.immutabledict[str, str]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "className",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "color",
    })
    
    @property
    def className(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("className")
        )
    
    @property
    def color(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("color", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    def __new__(cls, arg: AnimalDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Animal.validate(arg, configuration=configuration)
AnimalDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class Animal(
    schemas.Schema[AnimalDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "className",
    })
    discriminator: typing.Mapping[str, typing.Mapping[str, typing.Type[schemas.Schema]]] = dataclasses.field(
        default_factory=lambda: {
            'className': {
                'Cat': cat.Cat,
                'Dog': dog.Dog,
            }
        }
    )
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: AnimalDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            AnimalDictInput,
            AnimalDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AnimalDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


from petstore_api.components.schema import cat
from petstore_api.components.schema import dog
