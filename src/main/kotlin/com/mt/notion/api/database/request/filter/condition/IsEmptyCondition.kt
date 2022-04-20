package com.mt.notion.api.database.request.filter.condition

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.condition.number.NumberCondition
import com.mt.notion.api.database.request.filter.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class IsEmptyCondition(
    @JsonProperty("is_empty")
    val isEmpty: Boolean
) : ExistenceCondition, TextCondition, NumberCondition, SelectCondition, MultiSelectCondition