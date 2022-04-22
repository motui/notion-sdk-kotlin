package com.mt.notion.api.database.request.filter.property.condition.number

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class GreaterThanCondition(
    @JsonProperty("greater_than")
    val greaterThan: Number
) : NumberCondition