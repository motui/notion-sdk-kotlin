package com.mt.notion.api.page.response.property.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
data class RichTextObjectProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("rich_text")
    val richText: List<RichText>
) : WithObjectProperty
