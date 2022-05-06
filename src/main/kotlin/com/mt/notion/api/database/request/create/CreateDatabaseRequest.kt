package com.mt.notion.api.database.request.create

import com.mt.notion.api.database.request.create.property.WithCreateDatabaseProperty
import com.mt.notion.common.request.file.CoverRequest
import com.mt.notion.common.request.file.IconRequest
import com.mt.notion.common.request.parent.PageParentRequest
import com.mt.notion.common.request.richText.RichTextRequest
import com.mt.notion.http.NotionHttpRequestContent

/**
 * create database
 *
 * @author it.motui
 */
data class CreateDatabaseRequest(
    val parent: PageParentRequest,
    val properties: Map<String, WithCreateDatabaseProperty>,
    val icon: IconRequest? = null,
    val cover: CoverRequest? = null,
    val title: List<RichTextRequest>? = null,
) : NotionHttpRequestContent
