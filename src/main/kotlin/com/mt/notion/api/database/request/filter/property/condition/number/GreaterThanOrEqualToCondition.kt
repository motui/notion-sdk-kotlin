package com.mt.notion.api.database.request.filter.property.condition.number

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class GreaterThanOrEqualToCondition(
    @JsonProperty("greater_than_or_equal_to")
    val greaterThanOrEqualTo: Number
) : com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition