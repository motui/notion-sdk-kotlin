package com.mt.notion.api.database.request.filter.property

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class RichTextPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.RichText,
    @JsonProperty("rich_text")
    val richText: com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
) : PropertyFilter
