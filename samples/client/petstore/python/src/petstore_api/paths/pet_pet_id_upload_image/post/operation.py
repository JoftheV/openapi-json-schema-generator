# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client, security_schemes
from petstore_api.shared_imports.operation_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]
from petstore_api.paths.pet_pet_id_upload_image.post.request_body.content.multipart_form_data import schema

from .. import path
from .responses import response_200
from . import request_body
from .parameters import parameter_0
from .security import security_requirement_object_0
from .path_parameters import PathParameters, PathParametersDictInput, PathParametersDict
path_parameter_classes = (
    parameter_0.Parameter0,
)

_security: typing.List[security_schemes.SecurityRequirementObject] = [
    security_requirement_object_0.security_requirement_object,
]


__StatusCodeToResponse = typing.TypedDict(
    '__StatusCodeToResponse',
    {
        '200': typing.Type[response_200.ResponseFor200],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
}
_non_error_status_codes = frozenset({
    '200',
})

_all_accept_content_types = (
    "application/json",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _upload_image(
        self,
        path_params: typing.Union[
            PathParametersDictInput,
            PathParametersDict
        ],
        body: typing.Union[
            schema.SchemaDictInput,
            schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        *,
        skip_deserialization: typing.Literal[False] = False,
        content_type: typing.Literal["multipart/form-data"] = "multipart/form-data",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> response_200.ApiResponse: ...

    @typing.overload
    def _upload_image(
        self,
        path_params: typing.Union[
            PathParametersDictInput,
            PathParametersDict
        ],
        body: typing.Union[
            schema.SchemaDictInput,
            schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        *,
        skip_deserialization: typing.Literal[True],
        content_type: typing.Literal["multipart/form-data"] = "multipart/form-data",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _upload_image(
        self,
        path_params: typing.Union[
            PathParametersDictInput,
            PathParametersDict
        ],
        body: typing.Union[
            schema.SchemaDictInput,
            schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        *,
        skip_deserialization: bool = False,
        content_type: typing.Literal["multipart/form-data"] = "multipart/form-data",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ):
        """
        uploads an image
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        path_params = PathParameters.validate(
            path_params,
            configuration=self.api_client.schema_configuration
        )
        used_path, query_params_suffix = self._get_used_path(
            path,
            path_parameters=path_parameter_classes,
            path_params=path_params,
            skip_validation=True
        )
        headers = self._get_headers(accept_content_types=accept_content_types)
        # TODO add cookie handling

        fields, serialized_body = self._get_fields_and_body(
            request_body=request_body.RequestBody,
            body=body,
            content_type=content_type,
            headers=headers
        )
        host = self.api_client.configuration.get_server_url(
            "servers", server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            "paths//pet/{petId}/uploadImage/post/security",
            _security,
            security_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='post',
            host=host,
            headers=headers,
            fields=fields,
            body=serialized_body,
            security_requirement_object=security_requirement_object,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            skip_deser_response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
            self._verify_response_status(skip_deser_response)
            return skip_deser_response

        status = str(raw_response.status)
        if status in _non_error_status_codes:
            status_code = typing.cast(
                typing.Literal[
                    '200',
                ],
                status
            )
            return _status_code_to_response[status_code].deserialize(
                raw_response, self.api_client.schema_configuration)

        response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        self._verify_response_status(response)
        return response


class UploadImage(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    upload_image = BaseApi._upload_image


class ApiForPost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    post = BaseApi._upload_image
