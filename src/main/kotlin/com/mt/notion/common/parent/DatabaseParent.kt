package com.mt.notion.common.parent

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.DatabaseParentType

/**
 * Workspace parent
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
data class DatabaseParent(
    override val type: DatabaseParentType,
    @JsonProperty("database_id")
    val databaseId: String
) : WithDatabaseParent
