package com.mt.notion.api.database.request.query.filter.property.condition.formula

import com.mt.notion.api.database.request.query.filter.property.condition.number.NumberCondition

/**
 *
 * @author it.motui
 */
data class FormulaNumberCondition(
    val number: NumberCondition
) : FormulaCondition
