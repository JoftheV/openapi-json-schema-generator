package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class PropertiesValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val properties: Map<String, Class<out JsonSchema<*>>> = data.schema.properties ?: return null
        if (data.arg !is Map<*, *>) {
            return null
        }
        val pathToSchemas = PathToSchemasMap()
        val presentProperties: MutableSet<String> = LinkedHashSet()
        for (key in data.arg.keys) {
            if (key is String) {
                presentProperties.add(key)
            }
        }
        for ((propName, propClass) in properties.entries) {
            if (!presentProperties.contains(propName)) {
                continue
            }
            val propValue: Any? = data.arg[propName]
            val propPathToItem: MutableList<Any> = ArrayList(data.validationMetadata.pathToItem)
            propPathToItem.add(propName)
            val propValidationMetadata = ValidationMetadata(
                propPathToItem,
                data.validationMetadata.configuration,
                data.validationMetadata.validatedPathToSchemas,
                data.validationMetadata.seenClasses
            )
            val propSchema = JsonSchemaFactory.getInstance(propClass)
            if (propValidationMetadata.validationRanEarlier(propSchema)) {
                // todo add_deeper_validated_schemas
                continue
            }
            val otherPathToSchemas = JsonSchema.validate(propSchema, propValue, propValidationMetadata)
            pathToSchemas.update(otherPathToSchemas)
        }
        return pathToSchemas
    }
}
