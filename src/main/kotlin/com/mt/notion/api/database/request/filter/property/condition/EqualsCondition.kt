package com.mt.notion.api.database.request.filter.property.condition

/**
 *
 * @author it.motui
 */
data class EqualsCondition(
    val equals: String
) : com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
    com.mt.notion.api.database.request.filter.property.condition.SelectCondition,
    com.mt.notion.api.database.request.filter.property.condition.date.DateCondition