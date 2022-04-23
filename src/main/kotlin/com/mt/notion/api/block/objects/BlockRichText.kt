package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ApiColor

/**
 *
 * @author it.motui
 */
open class BlockRichText(
    @JsonProperty("rich_text")
    open val richText: List<com.mt.notion.common.response.richText.RichText>,
    open val color: ApiColor
)
