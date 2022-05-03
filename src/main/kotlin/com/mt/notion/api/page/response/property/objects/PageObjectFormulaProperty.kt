package com.mt.notion.api.page.response.property.objects

import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.formula.WithFormula

/**
 *
 * @author it.motui
 */
data class PageObjectFormulaProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    val formula: WithFormula?
) : WithPageObjectProperty
