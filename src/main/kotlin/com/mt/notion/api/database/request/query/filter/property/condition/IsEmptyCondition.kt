package com.mt.notion.api.database.request.query.filter.property.condition

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class IsEmptyCondition(
    @JsonProperty("is_empty")
    val isEmpty: Boolean
) : ExistenceCondition,
    com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition,
    com.mt.notion.api.database.request.query.filter.property.condition.number.NumberCondition,
    SelectCondition,
    MultiSelectCondition,
    com.mt.notion.api.database.request.query.filter.property.condition.date.DateCondition,
    PeopleCondition,
    RelationCondition