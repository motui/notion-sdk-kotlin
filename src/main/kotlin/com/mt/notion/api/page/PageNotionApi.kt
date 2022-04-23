package com.mt.notion.api.page

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.http.NotionHttpClient

/**
 * page api
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/page">page</a>
 */
class PageNotionApi(
    override val config: NotionApiConfig,
    override val notionHttpClient: NotionHttpClient
) : NotionApi {

}