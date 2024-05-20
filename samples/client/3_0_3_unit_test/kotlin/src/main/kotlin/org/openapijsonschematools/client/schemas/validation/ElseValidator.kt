package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class ElseValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val elseSchema: Class<out JsonSchema<*>> = data.schema.elseSchema ?: return null
        val ifPathToSchemas: PathToSchemasMap = data.ifPathToSchemas
            ?: // if unset
            return null
        if (!ifPathToSchemas.isEmpty()) {
            // if validation is true
            return null
        }
        val elseSchemaInstance = JsonSchemaFactory.getInstance(elseSchema)
        val pathToSchemas = PathToSchemasMap()
        val elsePathToSchemas = JsonSchema.validate(elseSchemaInstance, data.arg, data.validationMetadata)
        // todo capture validation error and describe it as an else error?
        pathToSchemas.update(elsePathToSchemas)
        return pathToSchemas
    }
}