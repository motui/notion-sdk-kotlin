package com.mt.notion.api.database.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * people
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class PeopleProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val people: EmptyObject?
) : DatabaseProperty
