package com.mt.notion.http

/**
 * notion http client
 *
 * @author it.motui
 * @since 0.1
 */
interface NotionHttpClient {
    val contentType: String
        get() = "application/json; charset=utf-8"

    /**
     * Bearer Authorization string
     *
     * eg: Bearer abcdefg
     * @since 0.1
     */
    fun bearerAuthorization(value: String): String {
        return "Bearer $value"
    }

    /**
     * Basic Authorization string
     *
     * eg: Basic abcdefg
     * @since 0.1
     */
    fun basicAuthorization(value: String): String {
        return "Basic $value"
    }

    /**
     * build http request header
     *
     * @param value token or other authorization string
     * @param notionVersion notion version
     * @param add other header
     * @since 0.1
     */
    fun buildHeader(
        value: String,
        notionVersion: String,
        add: Map<String, String>
    ): Map<String, String> {
        return mapOf(
            "Authorization" to value,
            "Notion-Version" to notionVersion,
        ).plus(add)
    }

    /**
     * build http request header
     *
     * @param value token or other authorization string
     * @param notionVersion notion version
     * @since 0.1
     */
    fun buildHeader(
        value: String,
        notionVersion: String
    ): Map<String, String> {
        return this.buildHeader(value, notionVersion, mapOf())
    }

    /**
     * http get request
     * @param request request param
     * @return response
     * @since 0.1
     */
    fun get(request: NotionHttpRequest): NotionHttpResponse

    /**
     * post get request
     * @param request request param
     * @return response
     * @since 0.1
     */
    fun post(request: NotionHttpRequest): NotionHttpResponse

    /**
     * put get request
     * @param request request param
     * @return response
     * @since 0.1
     */
    fun put(request: NotionHttpRequest): NotionHttpResponse

    /**
     * delete get request
     * @param request request param
     * @return response
     * @since 0.1
     */
    fun delete(request: NotionHttpRequest): NotionHttpResponse

}