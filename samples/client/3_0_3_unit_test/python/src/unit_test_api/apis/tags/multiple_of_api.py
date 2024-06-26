# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api.paths.response_body_post_by_number_response_body_for_content_types.post.operation import PostByNumberResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_by_int_request_body.post.operation import PostByIntRequestBody
from unit_test_api.paths.response_body_post_by_small_number_response_body_for_content_types.post.operation import PostBySmallNumberResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_by_small_number_request_body.post.operation import PostBySmallNumberRequestBody
from unit_test_api.paths.request_body_post_invalid_instance_should_not_raise_error_when_float_division_inf_request_body.post.operation import PostInvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfRequestBody
from unit_test_api.paths.response_body_post_invalid_instance_should_not_raise_error_when_float_division_inf_response_body_for_content_types.post.operation import PostInvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_by_number_request_body.post.operation import PostByNumberRequestBody
from unit_test_api.paths.response_body_post_by_int_response_body_for_content_types.post.operation import PostByIntResponseBodyForContentTypes


class MultipleOfApi(
    PostByNumberResponseBodyForContentTypes,
    PostByIntRequestBody,
    PostBySmallNumberResponseBodyForContentTypes,
    PostBySmallNumberRequestBody,
    PostInvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfRequestBody,
    PostInvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfResponseBodyForContentTypes,
    PostByNumberRequestBody,
    PostByIntResponseBodyForContentTypes,
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    pass
