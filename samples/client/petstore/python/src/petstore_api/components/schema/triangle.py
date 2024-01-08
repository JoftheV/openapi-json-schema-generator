# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from petstore_api.components.schema import equilateral_triangle
from petstore_api.components.schema import isosceles_triangle
from petstore_api.components.schema import scalene_triangle
OneOf = typing.Tuple[
    typing.Type[equilateral_triangle.EquilateralTriangle],
    typing.Type[isosceles_triangle.IsoscelesTriangle],
    typing.Type[scalene_triangle.ScaleneTriangle],
]


@dataclasses.dataclass(frozen=True)
class Triangle(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    discriminator: typing.Mapping[str, typing.Mapping[str, typing.Type[schemas.Schema]]] = dataclasses.field(
        default_factory=lambda: {
            'triangleType': {
                'EquilateralTriangle': equilateral_triangle.EquilateralTriangle,
                'IsoscelesTriangle': isosceles_triangle.IsoscelesTriangle,
                'ScaleneTriangle': scalene_triangle.ScaleneTriangle,
            }
        }
    )
    one_of: OneOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(OneOf)) # type: ignore

