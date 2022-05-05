package com.mt.notion.api.database.request.query.filter.property.condition.formula

import com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class FormulaStringCondition(
    val string: TextCondition
) : FormulaCondition
