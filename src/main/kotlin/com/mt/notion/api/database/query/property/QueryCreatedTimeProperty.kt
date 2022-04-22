package com.mt.notion.api.database.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 * createdTime
 *
 * @author it.motui
 */
data class QueryCreatedTimeProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("created_time")
    val createdTime: String?
) : QueryDatabaseProperty
