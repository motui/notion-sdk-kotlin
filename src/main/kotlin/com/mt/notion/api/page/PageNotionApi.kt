package com.mt.notion.api.page

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.api.page.response.Page
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

    /**
     * Retrieve a page
     *
     * @see <a href="https://developers.notion.com/reference/retrieve-a-page">Retrieve a page</a>
     */
    fun retrieve(pageId: String): Page {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/pages/${pageId}",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Page::class.java
        )
    }
}