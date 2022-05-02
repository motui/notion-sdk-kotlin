package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.formula.WithFormula

/**
 *
 * @author it.motui
 */
data class FormulaProperty(
    override val type: PropertyType,
    override val id: String,
    val formula: WithFormula?
) : WithProperty
