package com.mt.notion.api.page.request.propertiy

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class CreatePageRichTextProperty(
    override val type: PropertyType = PropertyType.RichText,
    @JsonProperty("rich_text")
    val richText: List<RichTextRequest>
) : WithCreatePageProperty
