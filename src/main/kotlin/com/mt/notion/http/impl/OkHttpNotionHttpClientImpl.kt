package com.mt.notion.http.impl

import com.mt.notion.http.NotionHttpClient
import com.mt.notion.http.NotionHttpRequestContent
import com.mt.notion.util.JsonUtil
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.slf4j.LoggerFactory
import java.util.concurrent.TimeUnit

/**
 * [NotionHttpClient]的OKHTTP实现
 *
 * TODO:待完善HTTP功能
 *
* @author it.motui
 */
class OkHttpNotionHttpClientImpl : NotionHttpClient {
    private val logger = LoggerFactory.getLogger(OkHttpNotionHttpClientImpl::class.java)
    private val client: OkHttpClient

    init {
        val client: OkHttpClient.Builder = OkHttpClient.Builder()
        client.connectTimeout(3_000, TimeUnit.MILLISECONDS)
        client.writeTimeout(30_000, TimeUnit.MILLISECONDS)
        client.readTimeout(30_000, TimeUnit.MILLISECONDS)
        this.client = client.build()
    }

    override fun <T> get(
        url: String,
        query: Map<String, String>,
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T {
        val requestUrl = super.buildRequestUrl(url, query)
        val httpRequest = Request.Builder().url(requestUrl).get()
        headers.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val body = response.body?.string() ?: ""
        if (response.isSuccessful && body.isNotBlank()) {
            return JsonUtil.instance().readValue(body, responseClass)
        }
        // TODO 自定义异常
        throw RuntimeException("get http error. url: $requestUrl, httpCode: ${response.code}, body: $body")
    }

    override fun <T> post(
        url: String,
        query: Map<String, String>,
        body: NotionHttpRequestContent,
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T {
        val requestUrl = super.buildRequestUrl(url, query)
        val requestBody: String = JsonUtil.instance().writeValueAsString(body)
        val httpRequest = Request.Builder().url(requestUrl).post(
            requestBody.toRequestBody(this.contentTypeJson.toMediaType())
        )
        headers.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val bodyString = response.body?.string() ?: ""
        if (response.isSuccessful && bodyString.isNotBlank()) {
            return JsonUtil.instance().readValue(bodyString, responseClass)
        }
        // TODO 自定义异常
        throw RuntimeException("post http error. url: $requestUrl, httpCode: ${response.code}, body: $body")
    }

    override fun <T> patch(
        url: String,
        query: Map<String, String>,
        body: NotionHttpRequestContent,
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T {
        val requestUrl = super.buildRequestUrl(url, query)
        val requestBody: String = JsonUtil.instance().writeValueAsString(body)
        val httpRequest = Request.Builder().url(requestUrl).patch(
            requestBody.toRequestBody(this.contentTypeJson.toMediaType())
        )
        headers.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val bodyString = response.body?.string() ?: ""
        if (response.isSuccessful && bodyString.isNotBlank()) {
            return JsonUtil.instance().readValue(bodyString, responseClass)
        }
        // TODO 自定义异常
        throw RuntimeException("patch http error. url: $requestUrl, httpCode: ${response.code}, body: $body")
    }

    override fun <T> delete(
        url: String,
        query: Map<String, String>,
        headers: Map<String, String>,
        responseClass: Class<T>
    ): T {
        val requestUrl = super.buildRequestUrl(url, query)
        val httpRequest = Request.Builder().url(requestUrl).delete()
        headers.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val body = response.body?.string() ?: ""
        if (response.isSuccessful && body.isNotBlank()) {
            return JsonUtil.instance().readValue(body, responseClass)
        }
        // TODO 自定义异常
        throw RuntimeException("delete http error. url: $requestUrl, httpCode: ${response.code}, body: $body")
    }

    override fun close() {
        this.client.dispatcher.executorService.shutdown()
        this.client.connectionPool.evictAll()
        this.client.cache?.close()
    }
}
