package com.mt.notion.api.database.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Select
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class UrlProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val url: EmptyObject?
) : DatabaseProperty
