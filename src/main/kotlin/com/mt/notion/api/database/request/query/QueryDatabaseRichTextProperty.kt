package com.mt.notion.api.database.request.query

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.richText.RichText

/**
 * Text
 *
 * @author it.motui
 */
data class QueryDatabaseRichTextProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("rich_text")
    val richText: List<RichText>
) : WithQueryDatabaseProperty
