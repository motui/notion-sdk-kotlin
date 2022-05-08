package com.mt.notion.api.search

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.api.search.request.SearchRequest
import com.mt.notion.http.NotionHttpClient

/**
 * search api
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/post-search">post-search</a>
 */
class SearchNotionApi(
    override val config: NotionApiConfig,
    override val notionHttpClient: NotionHttpClient
) : NotionApi {

    /**
     * Search
     */
    fun search(request: SearchRequest): Search {
        return notionHttpClient.post(
            url = "${this.config.baseUrl}/search",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            body = request,
            responseClass = Search::class.java
        )
    }

}