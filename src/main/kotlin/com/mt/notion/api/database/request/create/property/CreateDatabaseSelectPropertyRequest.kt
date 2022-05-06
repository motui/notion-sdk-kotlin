package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.select.SelectPropertyRequest

/**
 * Select
 *
 * @author it.motui
 */
data class CreateDatabaseSelectPropertyRequest(
    override val type: PropertyType = PropertyType.Select,
    val select: Select
) : WithCreateDatabaseProperty {
    data class Select(
        val options: List<SelectPropertyRequest>? = null
    )
}
