# coding: utf-8

"""
    Example
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import json_schema_api
from json_schema_api.components.schema.any_type_min_contains_value import AnyTypeMinContainsValue
from json_schema_api.configurations import schema_configuration


class TestAnyTypeMinContainsValue(unittest.TestCase):
    """AnyTypeMinContainsValue unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_min_contains_success_at_min(self):
        inst = AnyTypeMinContainsValue.validate((1, 1, 1))
        assert inst == (1, 1, 1)

    def test_min_contains_success_over_min(self):
        inst = AnyTypeMinContainsValue.validate((1, 1, 1, 1))
        assert inst == (1, 1, 1, 1)

    def test_min_contains_failure(self):
        with self.assertRaises(json_schema_api.ApiValueError):
            AnyTypeMinContainsValue.validate((1, 1))


if __name__ == '__main__':
    unittest.main()
