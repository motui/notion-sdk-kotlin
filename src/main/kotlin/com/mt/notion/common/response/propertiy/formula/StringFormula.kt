package com.mt.notion.common.response.propertiy.formula

/**
 *
 * @author it.motui
 */
data class StringFormula(
    override val type: FormulaType,
    val string: String?
) : WithFormula
