package com.mt.notion.api.database.request.filter

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.property.condition.date.DateCondition

/**
 *
 * @author it.motui
 */
data class TimestampCreatedTimeFilter(
    @JsonProperty("created_time")
    val createdTime: DateCondition,
    val timestamp: String = "created_time",
    val type: String? = "created_time"
) : Filter
