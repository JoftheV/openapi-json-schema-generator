# coding: utf-8
"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.server_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


@dataclasses.dataclass
class Server2(server.ServerWithoutVariables):
    '''
    staging server with no variables
    '''
    url: str = "https://localhost:8080"
