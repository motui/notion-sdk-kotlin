package com.mt.notion.api.database.request.query.filter.property.condition.date

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject

/**
 *
 * @author it.motui
 */
data class PastYearCondition(
    @JsonProperty("past_year")
    val pastYear: EmptyObject
) : DateCondition