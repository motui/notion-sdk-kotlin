package com.mt.notion.api.database.request.query.filter.property

import com.mt.notion.api.database.request.query.filter.property.condition.formula.FormulaCondition

/**
 *
 * @author it.motui
 */
data class FormulaPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Formula,
    val formula: FormulaCondition,
) : PropertyFilter
