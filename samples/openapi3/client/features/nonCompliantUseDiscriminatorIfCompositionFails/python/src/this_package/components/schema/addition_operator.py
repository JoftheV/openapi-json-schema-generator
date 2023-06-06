# coding: utf-8

"""
    discriminator-test
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from this_package.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema[U]
A: typing_extensions.TypeAlias = schemas.Float64Schema[U]
B: typing_extensions.TypeAlias = schemas.Float64Schema[U]


class OperatorId(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        default: str = "ADD"
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "a": typing.Type[A],
        "b": typing.Type[B],
        "operator_id": typing.Type[OperatorId],
    }
)


class AdditionOperator(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "a",
            "b",
            "operator_id",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    @property
    def a(self) -> A[decimal.Decimal]:
        return self.__getitem__("a")
    
    @property
    def b(self) -> B[decimal.Decimal]:
        return self.__getitem__("b")
    
    @property
    def operator_id(self) -> OperatorId[str]:
        return self.__getitem__("operator_id")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["a"]) -> A[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["b"]) -> B[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["operator_id"]) -> OperatorId[str]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["a"],
            typing_extensions.Literal["b"],
            typing_extensions.Literal["operator_id"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        a: typing.Union[
            A[decimal.Decimal],
            decimal.Decimal,
            int,
            float
        ],
        b: typing.Union[
            B[decimal.Decimal],
            decimal.Decimal,
            int,
            float
        ],
        operator_id: typing.Union[
            OperatorId[str],
            str
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> AdditionOperator[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            a=a,
            b=b,
            operator_id=operator_id,
            configuration_=configuration_,
        )
        inst = typing.cast(
            AdditionOperator[frozendict.frozendict],
            inst
        )
        return inst

