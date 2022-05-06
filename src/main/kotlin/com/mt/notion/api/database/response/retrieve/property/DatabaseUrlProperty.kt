package com.mt.notion.api.database.response.retrieve.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * url
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseUrlProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val url: EmptyObject?
) : WithDatabaseProperty
