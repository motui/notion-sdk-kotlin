package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.select.SelectPropertyRequest

/**
 * Select
 *
 * @author it.motui
 */
data class UpdateDatabaseSelectPropertyRequest(
    override val type: PropertyType = PropertyType.Select,
    override val name: String? = null,
    val select: Select
) : WithUpdateDatabaseProperty {
    data class Select(
        val options: List<SelectPropertyRequest>? = null
    )
}
