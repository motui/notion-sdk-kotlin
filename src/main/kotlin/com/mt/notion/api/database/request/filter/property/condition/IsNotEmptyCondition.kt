package com.mt.notion.api.database.request.filter.property.condition

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class IsNotEmptyCondition(
    @JsonProperty("is_not_empty")
    val isNotEmpty: Boolean
) : ExistenceCondition,
    com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
    com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition,
    SelectCondition,
    MultiSelectCondition,
    com.mt.notion.api.database.request.filter.property.condition.date.DateCondition,
    PeopleCondition,
    RelationCondition