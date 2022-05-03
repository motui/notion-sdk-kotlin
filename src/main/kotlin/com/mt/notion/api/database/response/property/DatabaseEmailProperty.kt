package com.mt.notion.api.database.response.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * email
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseEmailProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val email: EmptyObject?
) : WithDatabaseProperty
