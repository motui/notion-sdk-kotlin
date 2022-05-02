package com.mt.notion.common.response.propertiy.formula

/**
 *
 * @author it.motui
 */
data class NumberFormula(
    override val type: FormulaType,
    val number: Number?
) : WithFormula
