# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.security_scheme_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

@dataclasses.dataclass
class ApiKey(security_schemes.ApiKeySecurityScheme):
    '''
    apiKey in header
    '''
    name: str = "api_key"
    in_location: security_schemes.ApiKeyInLocation = security_schemes.ApiKeyInLocation.HEADER
