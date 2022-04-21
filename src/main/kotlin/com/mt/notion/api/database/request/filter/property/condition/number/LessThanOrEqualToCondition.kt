package com.mt.notion.api.database.request.filter.property.condition.number

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class LessThanOrEqualToCondition(
    @JsonProperty("less_than_or_equal_to")
    val lessThanOrEqualTo: Number
) : com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition