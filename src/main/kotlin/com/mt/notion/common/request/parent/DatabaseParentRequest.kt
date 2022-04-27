package com.mt.notion.common.request.parent

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.DatabaseParentType

/**
 * Database parent
 *
 * @author it.motui
 */
data class DatabaseParentRequest(
    override val type: DatabaseParentType = DatabaseParentType.DatabaseId,
    @JsonProperty("database_id")
    val databaseId: String?
) : WithDatabaseParentRequest
