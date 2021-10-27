package kotlinddd.exception.response

import kotlinddd.exception.response.base.BaseProjectResponseException
import io.ktor.http.*

class ResourceNotFoundException(message: String) :
    BaseProjectResponseException(
        HttpStatusCode.NotFound,
        message
    )
