# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .content.application_json import schema as application_json_schema


class ComponentRefSchemaStringWithValidation(api_client.PathParameter):
    name = "CRSstringWithValidation"


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_json_schema.Schema
    content = {
        'application/json': ApplicationJsonMediaType,
    }
    required = True
