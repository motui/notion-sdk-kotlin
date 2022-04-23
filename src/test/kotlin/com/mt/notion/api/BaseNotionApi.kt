package com.mt.notion.api

import com.mt.notion.http.NotionHttpClient
import com.mt.notion.http.impl.OkHttpNotionHttpClientImpl

/**
 *
 * @author it.motui
 */
open class BaseNotionApi {
    val BASE_URL = "https://api.notion.com/v1"
    val NOTION_VERSION = "2022-02-22"
    val BEARER_TOKEN = ""
    open val DATABASE_ID = ""
    open val PAGE_ID = "4870e8dd0f844a0b90dda942e1930498"
    open val BLOCK_ID = "dfe22609-e220-46c4-85a1-3e4ab7c0663b"

    fun notionApiConfig(): NotionApiConfig {
        return NotionApiConfig(BEARER_TOKEN, BASE_URL, NOTION_VERSION)
    }

    fun notionHttpClient(): NotionHttpClient {
        return OkHttpNotionHttpClientImpl()
    }
}