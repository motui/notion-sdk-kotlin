package com.mt.notion.api.database.response.retrieve.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 * Select
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseSelectProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val select: Select
) : WithDatabaseProperty {

    data class Select(
        val options: List<SelectPropertyResponse>
    )
}
