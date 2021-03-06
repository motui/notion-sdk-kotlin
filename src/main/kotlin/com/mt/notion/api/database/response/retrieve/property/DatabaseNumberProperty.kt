package com.mt.notion.api.database.response.retrieve.property

import com.mt.notion.common.NumberFormat
import com.mt.notion.common.PropertyType

/**
 * Number
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseNumberProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val number: Number
) : WithDatabaseProperty {

    data class Number(val format: NumberFormat)
}
