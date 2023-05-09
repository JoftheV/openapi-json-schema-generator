# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.schema_imports import *


class AbstractStepMessage(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Abstract Step
    """


    class Schema_:
        types = {
            frozendict.frozendict,
        }
        required = {
            "description",
            "discriminator",
            "sequenceNumber",
        }
        
        @staticmethod
        def discriminator():
            return {
                'discriminator': {
                    'AbstractStepMessage': AbstractStepMessage,
                }
            }
        
        class Properties:
            Discriminator = schemas.StrSchema
            __annotations__ = {
                "discriminator": Discriminator,
            }
        
        class AnyOf:
        
            @staticmethod
            def _0() -> typing.Type['AbstractStepMessage']:
                return AbstractStepMessage
            classes = [
                _0,
            ]

    
    @property
    def description(self) -> schemas.AnyTypeSchema:
        return self.__getitem__("description")
    
    @property
    def discriminator(self) -> Schema_.Properties.Discriminator:
        return self.__getitem__("discriminator")
    
    @property
    def sequenceNumber(self) -> schemas.AnyTypeSchema:
        return self.__getitem__("sequenceNumber")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> schemas.AnyTypeSchema: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["discriminator"]) -> Schema_.Properties.Discriminator: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sequenceNumber"]) -> schemas.AnyTypeSchema: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["description"],
            typing_extensions.Literal["discriminator"],
            typing_extensions.Literal["sequenceNumber"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

