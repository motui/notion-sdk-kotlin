package com.mt.notion.api.database.property

import com.mt.notion.common.PropertyType

/**
 * Formula
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class FormulaProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val formula: Formula
) : DatabaseProperty {
    data class Formula(val expression: String)
}