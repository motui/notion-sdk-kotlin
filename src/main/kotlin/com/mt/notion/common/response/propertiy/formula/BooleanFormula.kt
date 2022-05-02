package com.mt.notion.common.response.propertiy.formula

/**
 *
 * @author it.motui
 */
data class BooleanFormula(
    override val type: FormulaType,
    val boolean: Boolean?
) : WithFormula
