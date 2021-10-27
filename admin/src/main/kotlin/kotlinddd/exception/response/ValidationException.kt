package kotlinddd.exception.response

import kotlinddd.exception.response.base.BaseProjectResponseException
import io.ktor.http.*

class ValidationException(message: String) :
    BaseProjectResponseException(
        HttpStatusCode.BadRequest,
        message
    )
