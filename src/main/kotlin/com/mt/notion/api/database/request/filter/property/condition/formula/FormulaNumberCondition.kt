package com.mt.notion.api.database.request.filter.property.condition.formula

/**
 *
 * @author it.motui
 */
data class FormulaNumberCondition(
    val number: com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition
) : com.mt.notion.api.database.request.filter.property.condition.formula.FormulaCondition
