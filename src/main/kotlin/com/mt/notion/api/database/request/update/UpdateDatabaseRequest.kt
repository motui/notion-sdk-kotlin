package com.mt.notion.api.database.request.update

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.request.file.CoverRequest
import com.mt.notion.common.request.file.IconRequest
import com.mt.notion.common.request.richText.RichTextRequest
import com.mt.notion.http.NotionHttpRequestContent

/**
 * Updates an existing database as specified by the parameters.
 *
 * @author it.motui
 */
data class UpdateDatabaseRequest(
    val title: List<RichTextRequest>? = null,
    val icon: IconRequest? = null,
    val cover: CoverRequest? = null,
    val properties: Map<String, WithUpdateDatabaseProperty>,
) : NotionHttpRequestContent
