package com.mt.notion.api.database.request.filter.property.condition.formula

/**
 *
 * @author it.motui
 */
data class FormulaDateCondition(
    val date: com.mt.notion.api.database.request.filter.property.condition.date.DateCondition
) : com.mt.notion.api.database.request.filter.property.condition.formula.FormulaCondition
