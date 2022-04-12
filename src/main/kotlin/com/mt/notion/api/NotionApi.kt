package com.mt.notion.api

import com.mt.notion.NotionClient
import com.mt.notion.http.NotionHttpClient

/**
 * notion http api
 *
 * @author it.motui
 */
interface NotionApi {
    val token: String
    val config: NotionClient.PublicNotionConfig
    val notionHttpClient: NotionHttpClient

}