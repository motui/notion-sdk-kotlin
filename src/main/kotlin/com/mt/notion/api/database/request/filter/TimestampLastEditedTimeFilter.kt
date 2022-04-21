package com.mt.notion.api.database.request.filter

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.property.condition.date.DateCondition

/**
 *
 * @author it.motui
 */
data class TimestampLastEditedTimeFilter(
    @JsonProperty("last_edited_time")
    val lastEditedTime: DateCondition,
    val timestamp: String = "last_edited_time",
    val type: String? = "last_edited_time"
) : Filter
