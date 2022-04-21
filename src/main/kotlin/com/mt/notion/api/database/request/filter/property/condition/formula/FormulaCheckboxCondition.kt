package com.mt.notion.api.database.request.filter.property.condition.formula

/**
 *
 * @author it.motui
 */
data class FormulaCheckboxCondition(
    val checkbox: com.mt.notion.api.database.request.filter.property.condition.checkbox.CheckboxCondition
) : com.mt.notion.api.database.request.filter.property.condition.formula.FormulaCondition
