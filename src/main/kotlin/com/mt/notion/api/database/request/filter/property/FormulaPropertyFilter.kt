package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class FormulaPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Formula,
    val formula: com.mt.notion.api.database.request.filter.property.condition.formula.FormulaCondition,
) : PropertyFilter
