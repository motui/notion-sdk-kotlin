package com.mt.notion.api.database.request.filter.property.condition.number

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class LessThanCondition(
    @JsonProperty("less_than")
    val lessThan: Number
) : com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition