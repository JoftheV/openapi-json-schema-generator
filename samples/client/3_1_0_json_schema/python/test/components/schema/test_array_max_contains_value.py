# coding: utf-8

"""
    Example
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import json_schema_api
from json_schema_api.components.schema.array_max_contains_value import ArrayMaxContainsValue
from json_schema_api.configurations import schema_configuration


class TestArrayMaxContainsValue(unittest.TestCase):
    """ArrayMaxContainsValue unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_max_contains_success_under_max(self):
        inst = ArrayMaxContainsValue.validate((1,))
        assert inst == (1,)

    def test_max_contains_success_at_max(self):
        inst = ArrayMaxContainsValue.validate((2, 1, 1))
        assert inst == (2, 1, 1)

    def test_max_contains_failure(self):
        with self.assertRaises(json_schema_api.ApiValueError):
            ArrayMaxContainsValue.validate((2, 1, 1, 1))


if __name__ == '__main__':
    unittest.main()
