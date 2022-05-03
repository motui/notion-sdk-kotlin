package com.mt.notion.common.request.parent

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Page parent
 *
 * @author it.motui
 */
data class PageParentRequest(
    override val type: ParentType = ParentType.PageId,
    @JsonProperty("page_id")
    val pageId: String
) : WithParentRequest
