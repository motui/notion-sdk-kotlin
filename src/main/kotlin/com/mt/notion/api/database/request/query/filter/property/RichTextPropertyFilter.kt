package com.mt.notion.api.database.request.query.filter.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class RichTextPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.RichText,
    @JsonProperty("rich_text")
    val richText: TextCondition,
) : PropertyFilter
