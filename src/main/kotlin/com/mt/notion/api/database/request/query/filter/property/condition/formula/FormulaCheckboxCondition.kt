package com.mt.notion.api.database.request.query.filter.property.condition.formula

import com.mt.notion.api.database.request.query.filter.property.condition.checkbox.CheckboxCondition

/**
 *
 * @author it.motui
 */
data class FormulaCheckboxCondition(
    val checkbox: CheckboxCondition
) : FormulaCondition
