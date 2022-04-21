package com.mt.notion.api.database.request.filter.property.condition.date

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject

/**
 *
 * @author it.motui
 */
data class PastWeekCondition(
    @JsonProperty("past_week")
    val pastWeek: EmptyObject
) : com.mt.notion.api.database.request.filter.property.condition.date.DateCondition