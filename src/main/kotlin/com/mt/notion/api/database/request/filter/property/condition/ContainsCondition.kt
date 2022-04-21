package com.mt.notion.api.database.request.filter.property.condition

/**
 *
 * @author it.motui
 */
data class ContainsCondition(
    val contains: String
) : com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
    com.mt.notion.api.database.request.filter.property.condition.MultiSelectCondition,
    com.mt.notion.api.database.request.filter.property.condition.PeopleCondition,
    com.mt.notion.api.database.request.filter.property.condition.RelationCondition
