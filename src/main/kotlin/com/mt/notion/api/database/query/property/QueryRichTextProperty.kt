package com.mt.notion.api.database.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.richText.RichText

/**
 * Text
 *
 * @author it.motui
 */
data class QueryRichTextProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("rich_text")
    val richText: List<RichText>
) : QueryDatabaseProperty
