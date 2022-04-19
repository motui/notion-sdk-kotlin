package com.mt.notion.http

import java.net.URLEncoder

/**
 * notion http client
 *
 * @author it.motui
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
     * 参数编码
     *
     * @since 0.1
     */
    fun urlEncode(value: String): String = URLEncoder.encode(value, "UTF-8")

    /**
     * 构建请求参数
     *
     * eg:?a=123&b=456
     * @since 0.1
     */
    fun buildQueryParams(query: Map<String, String>): String =
        query.map { "${urlEncode(it.key)}=${urlEncode(it.value)}" }
            .joinToString(prefix = "?", separator = "&")

    /**
     * 构建请求url
     *
     * eg:https://api.notion.com/api/v1/test?a=123&b=456
     * @since 0.1
     */
    fun buildRequestUrl(url: String, queryParams: String): String = url + if (queryParams != "?") queryParams else ""

    /**
     * 构建请求url
     *
     * eg:https://api.notion.com/api/v1/test?a=123&b=456
     * @since 0.1
     */
    fun buildRequestUrl(url: String, query: Map<String, String>): String =
        this.buildRequestUrl(url, this.buildQueryParams(query))

    /**
     * GET请求
     *
     * 根据[url]/[query]/[headers]发送HTTP请求,返回response#body反序列化类[responseClass]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> get(
        url: String,
        query: Map<String, String> = emptyMap(),
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T

    /**
     * POST请求
     *
     * 根据[url]/[query]/[body]/[headers]发送HTTP请求,返回response#body反序列化类[responseClass]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> post(
        url: String,
        query: Map<String, String> = emptyMap(),
        body: NotionHttpRequestContent,
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T

    /**
     * PATCH请求
     *
     * 根据[url]/[query]/[body]/[headers]发送HTTP请求,返回response#body反序列化类[responseClass]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> patch(
        url: String,
        query: Map<String, String> = emptyMap(),
        body: NotionHttpRequestContent,
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T

    /**
     * delete请求
     *
     * 根据[url]/[query]/[headers]发送HTTP请求,返回response#body反序列化类[responseClass]
     * 该方法实现类需要自行控制异常码和异常解析
     * @since 0.1
     */
    fun <T> delete(
        url: String,
        query: Map<String, String> = emptyMap(),
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T
}
