package com.mt.notion.http

/**
 * notion http client
 *
 * @author it.motui
 * @since 0.1
 */
interface NotionHttpClient : AutoCloseable, Cloneable {
    /**
     * http json content type
     */
    val contentTypeJson: String
        get() = "application/json; charset=utf-8"

    /**
     * Bearer Authorization字符串
     *
     * eg: Bearer abcdefg
     * @since 0.1
     */
    fun bearerAuthorization(value: String): String {
        return "Bearer $value"
    }

    /**
     * Basic Authorization字符串
     *
     * eg: Basic abcdefg
     * @since 0.1
     */
    fun basicAuthorization(value: String): String {
        return "Basic $value"
    }

    /**
     * 构建请求头
     *
     * 根据token或其他认证字符串[value]、notion版本[notionVersion]、附加的请求头属性[add]构建HTTP请求头
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
     * 构建请求头
     *
     * 根据token或其他认证字符串[value]、notion版本[notionVersion]构建HTTP请求头
     * @since 0.1
     */
    fun buildHeader(
        value: String,
        notionVersion: String
    ): Map<String, String> {
        return this.buildHeader(value, notionVersion, mapOf())
    }

    /**
     * GET请求
     *
     * 根据[request]发送HTTP请求,返回response#body反序列化类[T]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> get(request: NotionHttpRequest): T

    /**
     * POST请求
     *
     * 根据[request]发送HTTP请求,返回response#body反序列化类[T]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> post(request: NotionHttpRequest): T

    /**
     * PATCH请求
     *
     * 根据[request]发送HTTP请求,返回response#body反序列化类[T]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> patch(request: NotionHttpRequest): T

    /**
     * delete请求
     *
     * 根据[request]发送HTTP请求,返回response#body反序列化类[T]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> delete(request: NotionHttpRequest): T

}