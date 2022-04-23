package com.mt.notion.common.parent

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.DatabaseParentType

/**
 * Page parent
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
data class PageParent(
    override val type: DatabaseParentType,
    @JsonProperty("page_id")
    val pageId: String
) : WithDatabaseParent
