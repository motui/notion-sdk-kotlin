package com.mt.notion.api.page.request.update

import com.mt.notion.api.page.request.propertiy.WithCreateProperty
import com.mt.notion.common.request.file.CoverRequest
import com.mt.notion.common.request.file.IconRequest
import com.mt.notion.http.NotionHttpRequestContent

/**
 *
 * @author it.motui
 */
data class UpdatePageRequest(
    val properties: Map<String, WithCreateProperty>? = null,
    val icon: IconRequest? = null,
    val cover: CoverRequest? = null,
    val archived: Boolean? = null
) : NotionHttpRequestContent