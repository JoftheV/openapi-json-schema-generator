# coding: utf-8
"""
    discriminator-test
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import dataclasses
import typing

import urllib3

from this_package import schemas


class ApiResponse:
    def __init__(
        self,
        *,
        response: urllib3.HTTPResponse,
        body: typing.Union[schemas.Unset, schemas.OUTPUT_BASE_TYPES] = schemas.unset,
        headers: typing.Union[schemas.Unset, typing.Mapping[str, schemas.OUTPUT_BASE_TYPES]] = schemas.unset
    ):
        self.response = response
        self.body = body
        self. headers = headers


class ApiResponseWithoutDeserialization(ApiResponse):
    def __init__(
        self,
        *,
        response: urllib3.HTTPResponse,
        body: schemas.Unset = schemas.unset,
        headers: schemas.Unset = schemas.unset
    ):
        self.response = response
        self.body = body
        self. headers = headers
