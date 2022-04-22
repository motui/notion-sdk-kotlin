package com.mt.notion.api.database.request.filter.property.condition.formula

import com.mt.notion.api.database.request.filter.property.condition.date.DateCondition

/**
 *
 * @author it.motui
 */
data class FormulaDateCondition(
    val date: DateCondition
) : FormulaCondition
