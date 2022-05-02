package com.mt.notion.common.response.propertiy.formula

import com.mt.notion.common.response.DateResponse

/**
 *
 * @author it.motui
 */
data class DateFormula(
    override val type: FormulaType,
    val date: DateResponse?
) : WithFormula
