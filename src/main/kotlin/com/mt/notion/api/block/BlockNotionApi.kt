package com.mt.notion.api.block

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.api.block.objects.WithBlockObject
import com.mt.notion.api.block.request.update.UpdateBlockRequest
import com.mt.notion.http.NotionHttpClient

/**
 * block api
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/block">block</a>
 */
class BlockNotionApi(
    override val config: NotionApiConfig,
    override val notionHttpClient: NotionHttpClient
) : NotionApi {

    /**
     * Retrieve a block
     *
     * @see <a href="https://developers.notion.com/reference/retrieve-a-block">Retrieve a block</a>
     */
    fun retrieve(blockId: String): WithBlockObject {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/blocks/${blockId}",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = WithBlockObject::class.java
        )
    }

    /**
     * Retrieve block children
     *
     * @see <a href="https://developers.notion.com/reference/get-block-children">Retrieve block children</a>
     */
    fun children(blockId: String, request: BlocksRequest): Blocks {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/blocks/${blockId}/children",
            query = request.toMap(),
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Blocks::class.java
        )
    }

    /**
     * Update a block
     *
     * @see <a href="https://developers.notion.com/reference/update-a-block">Update a block</a>
     */
    fun update(blockId: String, request: UpdateBlockRequest): WithBlockObject {
        return notionHttpClient.patch(
            url = "${this.config.baseUrl}/blocks/${blockId}",
            body = request,
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = WithBlockObject::class.java
        )
    }

    /**
     * Delete a block
     *
     * @see <a href="https://developers.notion.com/reference/delete-a-block">Delete a block</a>
     */
    fun delete(blockId: String): WithBlockObject {
        return notionHttpClient.delete(
            url = "${this.config.baseUrl}/blocks/${blockId}",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = WithBlockObject::class.java
        )
    }

    /**
     * Append block children
     *
     * @see <a href="https://developers.notion.com/reference/patch-block-children">Append block children</a>
     */
    fun append(blockId: String, request: UpdateBlockRequest): Blocks {
        return notionHttpClient.patch(
            url = "${this.config.baseUrl}/blocks/${blockId}",
            body = request,
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Blocks::class.java
        )
    }
}