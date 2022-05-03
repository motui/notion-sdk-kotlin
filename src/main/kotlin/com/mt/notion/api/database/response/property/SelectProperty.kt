package com.mt.notion.api.database.response.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 * Select
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class SelectProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val select: Select
) : DatabaseProperty {

    data class Select(
        val options: List<SelectPropertyResponse>
    )
}
