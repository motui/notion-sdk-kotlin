package com.mt.notion.http.impl

import com.fasterxml.jackson.core.type.TypeReference
import com.mt.notion.http.NotionHttpClient
import com.mt.notion.http.NotionHttpRequest
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
 * @since 0.1
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

    override fun <T> get(request: NotionHttpRequest): T {
        val httpRequest = Request.Builder().url(request.url).get()
        request.header?.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val body = response.body?.string() ?: ""
        if (response.isSuccessful && body.isNotBlank()) {
            return JsonUtil.instance().readValue(body, object : TypeReference<T>() {})
        }
        // TODO 自定义异常
        throw RuntimeException("get http error. url: ${request.url}, httpCode: ${response.code}, body: $body")
    }

    override fun <T> post(request: NotionHttpRequest): T {
        val requestContent: String = JsonUtil.instance().writeValueAsString(request.content)
        val httpRequest = Request.Builder().url(request.url).post(
            requestContent.toRequestBody(this.contentTypeJson.toMediaType())
        )
        request.header?.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val body = response.body?.string() ?: ""
        if (response.isSuccessful && body.isNotBlank()) {
            return JsonUtil.instance().readValue(body, object : TypeReference<T>() {})
        }
        // TODO 自定义异常
        throw RuntimeException("post http error. url: ${request.url}, httpCode: ${response.code}, body: $body")
    }

    override fun <T> patch(request: NotionHttpRequest): T {
        val requestContent: String = JsonUtil.instance().writeValueAsString(request.content)
        val httpRequest = Request.Builder().url(request.url).patch(
            requestContent.toRequestBody(this.contentTypeJson.toMediaType())
        )
        request.header?.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val body = response.body?.string() ?: ""
        if (response.isSuccessful && body.isNotBlank()) {
            return JsonUtil.instance().readValue(body, object : TypeReference<T>() {})
        }
        // TODO 自定义异常
        throw RuntimeException("put http error. url: ${request.url}, httpCode: ${response.code}, body: $body")
    }

    override fun <T> delete(request: NotionHttpRequest): T {
        val requestContent: String = JsonUtil.instance().writeValueAsString(request.content)
        val httpRequest = Request.Builder().url(request.url).delete(
            requestContent.toRequestBody(this.contentTypeJson.toMediaType())
        )
        request.header?.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        val body = response.body?.string() ?: ""
        if (response.isSuccessful && body.isNotBlank()) {
            return JsonUtil.instance().readValue(body, object : TypeReference<T>() {})
        }
        // TODO 自定义异常
        throw RuntimeException("delete http error. url: ${request.url}, httpCode: ${response.code}, body: $body")
    }

    override fun close() {
        this.client.dispatcher.executorService.shutdown()
        this.client.connectionPool.evictAll()
        this.client.cache?.close()
    }
}