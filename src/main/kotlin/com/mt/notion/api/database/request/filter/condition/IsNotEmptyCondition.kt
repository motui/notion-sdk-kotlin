package com.mt.notion.api.database.request.filter.condition

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.condition.number.NumberCondition
import com.mt.notion.api.database.request.filter.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class IsNotEmptyCondition(
    @JsonProperty("is_not_empty")
    val isNotEmpty: Boolean
) : ExistenceCondition, TextCondition, NumberCondition, SelectCondition, MultiSelectCondition