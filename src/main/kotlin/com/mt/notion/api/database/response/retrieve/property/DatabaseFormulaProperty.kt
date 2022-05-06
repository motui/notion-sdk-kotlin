package com.mt.notion.api.database.response.retrieve.property

import com.mt.notion.common.Expression
import com.mt.notion.common.PropertyType

/**
 * Formula
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseFormulaProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val formula: Expression
) : WithDatabaseProperty