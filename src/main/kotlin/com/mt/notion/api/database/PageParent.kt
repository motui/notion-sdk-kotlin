package com.mt.notion.api.database

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Page parent
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
data class PageParent(
    override val type: DatabaseParentType,
    @JsonProperty("page_id")
    val pageId: String
) : WithDatabaseParent