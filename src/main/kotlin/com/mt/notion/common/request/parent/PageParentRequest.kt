package com.mt.notion.common.request.parent

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.ParentType

/**
 * Page parent
 *
 * @author it.motui
 */
data class PageParentRequest(
    override val type: ParentType = ParentType.PageId,
    @JsonProperty("page_id")
    val pageId: String?
) : WithParentRequest
