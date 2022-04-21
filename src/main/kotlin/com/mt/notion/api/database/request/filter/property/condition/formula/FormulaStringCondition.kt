package com.mt.notion.api.database.request.filter.property.condition.formula

/**
 *
 * @author it.motui
 */
data class FormulaStringCondition(
    val string: com.mt.notion.api.database.request.filter.property.condition.text.TextCondition
) : com.mt.notion.api.database.request.filter.property.condition.formula.FormulaCondition
