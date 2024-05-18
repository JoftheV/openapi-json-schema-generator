# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api.paths.request_body_post_not_multiple_types_request_body.post.operation import PostNotMultipleTypesRequestBody
from unit_test_api.paths.request_body_post_not_request_body.post.operation import PostNotRequestBody
from unit_test_api.paths.response_body_post_not_response_body_for_content_types.post.operation import PostNotResponseBodyForContentTypes
from unit_test_api.paths.response_body_post_not_multiple_types_response_body_for_content_types.post.operation import PostNotMultipleTypesResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_not_more_complex_schema_request_body.post.operation import PostNotMoreComplexSchemaRequestBody
from unit_test_api.paths.response_body_post_forbidden_property_response_body_for_content_types.post.operation import PostForbiddenPropertyResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_forbidden_property_request_body.post.operation import PostForbiddenPropertyRequestBody
from unit_test_api.paths.response_body_post_not_more_complex_schema_response_body_for_content_types.post.operation import PostNotMoreComplexSchemaResponseBodyForContentTypes


class _NotApi(
    PostNotMultipleTypesRequestBody,
    PostNotRequestBody,
    PostNotResponseBodyForContentTypes,
    PostNotMultipleTypesResponseBodyForContentTypes,
    PostNotMoreComplexSchemaRequestBody,
    PostForbiddenPropertyResponseBodyForContentTypes,
    PostForbiddenPropertyRequestBody,
    PostNotMoreComplexSchemaResponseBodyForContentTypes,
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    pass
