package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.NumberFormat
import com.mt.notion.common.PropertyType

/**
 * Number
 *
 * @author it.motui
 */
data class CreateDatabaseNumberPropertyRequest(
    override val type: PropertyType = PropertyType.Number,
    val number: Number
) : WithCreateDatabaseProperty {
    data class Number(val format: NumberFormat?)
}
