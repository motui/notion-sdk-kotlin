package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class RollupSubRichTextCondition(
    @JsonProperty("rich_text")
    val richText: TextCondition
) : RollupSubCondition
