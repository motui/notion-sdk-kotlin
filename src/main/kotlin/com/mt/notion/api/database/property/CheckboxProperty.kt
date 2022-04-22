package com.mt.notion.api.database.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * checkbox
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class CheckboxProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val checkbox: EmptyObject?
) : DatabaseProperty
