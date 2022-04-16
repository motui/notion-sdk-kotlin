package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.richText.RichText

/**
 * Text
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class TextProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("rich_text")
    val richText: RichText
) : DatabaseProperty
