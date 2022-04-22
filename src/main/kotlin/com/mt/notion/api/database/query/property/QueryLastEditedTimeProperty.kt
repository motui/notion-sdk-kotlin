package com.mt.notion.api.database.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 * lastEditedTime
 *
 * @author it.motui
 */
data class QueryLastEditedTimeProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("last_edited_time")
    val lastEditedTime: String?
) : QueryDatabaseProperty
