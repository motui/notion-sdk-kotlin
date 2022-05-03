package com.mt.notion.api.page

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.api.block.BlocksRequest
import com.mt.notion.api.page.request.create.WithCreatePageBody
import com.mt.notion.api.page.request.update.UpdatePageRequest
import com.mt.notion.api.page.response.Page
import com.mt.notion.api.page.response.property.objects.WithObjectProperty
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

    /**
     * Create a page
     *
     * @see <a href="https://developers.notion.com/reference/post-page">Create a page</a>
     */
    fun create(request: WithCreatePageBody): Page {
        return notionHttpClient.post(
            url = "${this.config.baseUrl}/pages",
            body = request,
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Page::class.java
        )
    }

    /**
     * Update page
     *
     * @see <a href="https://developers.notion.com/reference/patch-page">Update page</a>
     */
    fun update(pageId: String, request: UpdatePageRequest): Page {
        return notionHttpClient.patch(
            url = "${this.config.baseUrl}/pages/${pageId}",
            body = request,
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Page::class.java
        )
    }

    /**
     * Retrieve a page property item
     *
     * @see <a href="https://developers.notion.com/reference/retrieve-a-page-property">Retrieve a page property item</a>
     * @see <a href="https://developers.notion.com/reference/retrieving-property-value-limitations">Limitations</a>
     */
    fun retrieveProperty(pageId: String, propertyId: String, request: BlocksRequest): WithObjectProperty {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/pages/${pageId}/properties/${propertyId}",
            query = request.toMap(),
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = WithObjectProperty::class.java
        )
    }

}