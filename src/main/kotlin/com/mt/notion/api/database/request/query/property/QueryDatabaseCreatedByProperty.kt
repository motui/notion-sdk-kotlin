package com.mt.notion.api.database.request.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.PropertyType

/**
 * CreatedBy
 *
 * @author it.motui
 */
data class QueryDatabaseCreatedByProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("created_by")
    val createdBy: User
) : WithQueryDatabaseProperty
