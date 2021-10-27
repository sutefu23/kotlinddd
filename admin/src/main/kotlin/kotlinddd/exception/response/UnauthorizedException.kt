package kotlinddd.exception.response

import kotlinddd.exception.response.base.BaseProjectResponseException
import io.ktor.http.*

class UnauthorizedException(message: String) :
    BaseProjectResponseException(
        HttpStatusCode.Unauthorized,
        message
    )
