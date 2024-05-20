package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class ContainsValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        if (data.arg !is List<*>) {
            return null
        }
        val containsPathToSchemas: List<PathToSchemasMap>? = data.containsPathToSchemas
        if (containsPathToSchemas.isNullOrEmpty()) {
            throw ValidationException(
                "Validation failed for contains keyword in class=${data.schema.javaClass}"
                + " at pathToItem=${data.validationMetadata.pathToItem}. No "
                + "items validated to the contains schema."
            )
        }
        val pathToSchemas = PathToSchemasMap()
        for (otherPathToSchema in containsPathToSchemas) {
            pathToSchemas.update(otherPathToSchema)
        }
        return pathToSchemas
    }
}