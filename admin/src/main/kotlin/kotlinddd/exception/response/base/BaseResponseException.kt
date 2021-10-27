package kotlinddd.exception.response.base

import kotlinddd.exception.base.BaseProjectException
import io.ktor.http.*

open class BaseProjectResponseException(
    val status: HttpStatusCode,
    override val message: String
) : BaseProjectException(message)