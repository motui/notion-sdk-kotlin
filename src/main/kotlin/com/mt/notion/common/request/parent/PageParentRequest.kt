package com.mt.notion.common.request.parent

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.DatabaseParentType

/**
 * Page parent
 *
 * @author it.motui
 */
data class PageParentRequest(
    override val type: DatabaseParentType = DatabaseParentType.PageId,
    @JsonProperty("page_id")
    val pageId: String?
) : WithDatabaseParentRequest
