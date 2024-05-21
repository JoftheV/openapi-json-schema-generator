package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MinLengthValidator : LengthValidator(), KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val minLength: Int = data.schema.minLength ?: return null
        if (data.arg !is String) {
            return null
        }
        val length = getLength(data.arg)
        if (length < minLength) {
            throw ValidationException("Value ${data.arg} is invalid because has < the minLength of $minLength")
        }
        return null
    }
}