package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class RollupSubRichTextCondition(
    @JsonProperty("rich_text")
    val richText: com.mt.notion.api.database.request.filter.property.condition.text.TextCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
