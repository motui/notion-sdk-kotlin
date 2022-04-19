package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Text
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class RichTextProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("rich_text")
    val richText: EmptyObject?
) : DatabaseProperty
