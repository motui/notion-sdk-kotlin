package com.mt.notion.api.database.request.filter.property.condition

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class IsEmptyCondition(
    @JsonProperty("is_empty")
    val isEmpty: Boolean
) : com.mt.notion.api.database.request.filter.property.condition.ExistenceCondition,
    com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
    com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition,
    com.mt.notion.api.database.request.filter.property.condition.SelectCondition,
    com.mt.notion.api.database.request.filter.property.condition.MultiSelectCondition,
    com.mt.notion.api.database.request.filter.property.condition.date.DateCondition,
    com.mt.notion.api.database.request.filter.property.condition.PeopleCondition,
    com.mt.notion.api.database.request.filter.property.condition.RelationCondition