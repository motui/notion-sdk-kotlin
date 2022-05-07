package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.NumberFormat
import com.mt.notion.common.PropertyType

/**
 * Number
 *
 * @author it.motui
 */
data class UpdateDatabaseNumberPropertyRequest(
    override val type: PropertyType = PropertyType.Number,
    override val name: String? = null,
    val number: Number
) : WithUpdateDatabaseProperty {
    data class Number(val format: NumberFormat? = null)
}
