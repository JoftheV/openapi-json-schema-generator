package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MaxItemsValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val maxItems: Int = data.schema.maxItems ?: return null
        if (data.arg !is List<*>) {
            return null
        }
        if (data.arg.size > maxItems) {
            throw ValidationException("Value ${data.arg} is invalid because has > the maxItems of $maxItems")
        }
        return null
    }
}
