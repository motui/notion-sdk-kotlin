package com.mt.notion.common.response.parent

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.request.parent.ParentType

/**
 * Workspace parent
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
data class DatabaseParent(
    override val type: ParentType,
    @JsonProperty("database_id")
    val databaseId: String
) : WithParent
