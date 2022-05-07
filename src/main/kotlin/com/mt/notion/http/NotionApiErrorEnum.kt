package com.mt.notion.http

/**
 * [Errors](https://developers.notion.com/reference/errors)
 *
 * @author it.motui
 */
enum class NotionApiErrorEnum constructor(
    private val httpStatusCode: Int,
    private val code: String
) {
    /**
     * The request body could not be decoded as JSON.
     */
    INVALID_JSON(400, "invalid_json"),

    /**
     * The request URL is not valid.
     */
    INVALID_REQUEST_URL(400, "invalid_request_url"),

    /**
     * This request is not supported.
     */
    INVALID_REQUEST(400, "invalid_request"),

    /**
     * The request body does not match the schema for the expected parameters. Check the "message" property for more details.
     */
    VALIDATION_ERROR(400, "validation_error"),

    /**
     * 	The request is missing the required Notion-Version header. See [Versioning](https://developers.notion.com/reference/versioning).
     */
    MISSING_VERSION(400, "missing_version"),

    /**
     * The bearer token is not valid.
     */
    UNAUTHORIZED(401, "unauthorized"),

    /**
     * Given the bearer token used, the client doesn't have permission to perform this operation.
     */
    RESTRICTED_RESOURCE(403, "restricted_resource"),

    /**
     * Given the bearer token used, the resource does not exist. This error can also indicate that the resource has not been shared with owner of the bearer token.
     */
    OBJECT_NOT_FOUND(404, "object_not_found"),

    /**
     * The transaction could not be completed, potentially due to a data collision. Make sure the parameters are up to date and try again.
     */
    CONFLICT_ERROR(409, "conflict_error"),

    /**
     * This request exceeds the number of requests allowed. Slow down and try again. [More details on rate limits](https://developers.notion.com/reference/errors#request-limits)
     */
    RATE_LIMITED(429, "rate_limited"),

    /**
     * An unexpected error occurred. Reach out to [Notion support](https://www.notion.so/notion/Notion-Official-83715d7703ee4b8699b5e659a4712dd8?target=intercom).
     */
    INTERNAL_SERVER_ERROR(500, "internal_server_error"),

    /**
     * Notion is unavailable. Try again later. This can occur when the time to respond to a request takes longer than 60 seconds, the maximum request timeout.
     */
    SERVICE_UNAVAILABLE(503, "service_unavailable"),

    /**
     * Notion's database is unavailable or in an unqueryable state. Try again later.
     */
    DATABASE_CONNECTION_UNAVAILABLE(503, "database_connection_unavailable"),
}