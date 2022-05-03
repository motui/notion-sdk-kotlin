package com.mt.notion.api.database.response.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * date
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseDateProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val date: EmptyObject?,
) : WithDatabaseProperty
