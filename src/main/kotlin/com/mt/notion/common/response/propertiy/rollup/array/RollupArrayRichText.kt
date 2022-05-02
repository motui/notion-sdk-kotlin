package com.mt.notion.common.response.propertiy.rollup.array

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
data class RollupArrayRichText(
    override val type: RollupArrayType,
    @JsonProperty("rich_text")
    val richText: List<RichText>
) : WithRollupArray