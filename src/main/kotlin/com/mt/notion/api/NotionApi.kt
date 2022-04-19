package com.mt.notion.api

import com.mt.notion.http.NotionHttpClient

/**
 * notion http api
 *
 * @author it.motui
 */
interface NotionApi {
    val config: NotionApiConfig
    val notionHttpClient: NotionHttpClient
}
