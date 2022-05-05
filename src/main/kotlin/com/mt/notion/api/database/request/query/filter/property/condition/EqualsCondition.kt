package com.mt.notion.api.database.request.query.filter.property.condition

import com.mt.notion.api.database.request.query.filter.property.condition.date.DateCondition
import com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class EqualsCondition(
    val equals: String
) : TextCondition,
    SelectCondition,
    DateCondition