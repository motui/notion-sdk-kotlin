package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
data class RichTextProperty(
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("rich_text")
    val richText: List<RichText>
) : WithProperty
