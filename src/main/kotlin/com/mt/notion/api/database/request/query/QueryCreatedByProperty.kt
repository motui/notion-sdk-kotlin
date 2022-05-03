package com.mt.notion.api.database.request.query

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.PropertyType

/**
 * CreatedBy
 *
 * @author it.motui
 */
data class QueryCreatedByProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("created_by")
    val createdBy: User
) : QueryDatabaseProperty
