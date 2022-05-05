package com.mt.notion.api.database.request.query.filter.property.condition

import com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class ContainsCondition(
    val contains: String
) : TextCondition,
    MultiSelectCondition,
    PeopleCondition,
    RelationCondition
