package com.mt.notion.http

import okhttp3.OkHttpClient
import okhttp3.Request
import org.slf4j.LoggerFactory
import java.util.concurrent.TimeUnit

/**
 * okhttp implemented [NotionHttpClient]
 *
 * @author it.motui
 */
class OkHttpNotionHttpClient() : NotionHttpClient {
    private val logger = LoggerFactory.getLogger(OkHttpNotionHttpClient::class.java)
    private val client: OkHttpClient

    init {
        val client: OkHttpClient.Builder = OkHttpClient.Builder()
        client.connectTimeout(3_000, TimeUnit.MILLISECONDS)
        client.writeTimeout(30_000, TimeUnit.MILLISECONDS)
        client.readTimeout(30_000, TimeUnit.MILLISECONDS)
        this.client = client.build()
    }

    override fun get(request: NotionHttpRequest): NotionHttpResponse {
        val httpRequest = Request.Builder().url(request.url).get()
        request.header?.forEach { (name, value) -> httpRequest.header(name, value) }
        val response = client.newCall(httpRequest.build()).execute()
        return NotionHttpResponse(
            httpCode = response.code,
            headers = response.headers.toMultimap(),
            body = response.body?.string() ?: ""
        )
    }

    override fun post(request: NotionHttpRequest): NotionHttpResponse {
        TODO("Not yet implemented")
    }

    override fun put(request: NotionHttpRequest): NotionHttpResponse {
        TODO("Not yet implemented")
    }

    override fun delete(request: NotionHttpRequest): NotionHttpResponse {
        TODO("Not yet implemented")
    }
}