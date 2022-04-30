package com.mt.notion.common.request.parent

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.ParentType

/**
 * Database parent
 *
 * @author it.motui
 */
data class DatabaseParentRequest(
    override val type: ParentType = ParentType.DatabaseId,
    @JsonProperty("database_id")
    val databaseId: String?
) : WithParentRequest
