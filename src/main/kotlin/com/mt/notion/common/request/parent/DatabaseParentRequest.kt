package com.mt.notion.common.request.parent

import com.fasterxml.jackson.annotation.JsonProperty

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
