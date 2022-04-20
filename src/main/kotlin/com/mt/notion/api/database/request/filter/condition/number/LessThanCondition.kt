package com.mt.notion.api.database.request.filter.condition.number

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class LessThanCondition(
    @JsonProperty("less_than")
    val lessThan: Number
) : NumberCondition