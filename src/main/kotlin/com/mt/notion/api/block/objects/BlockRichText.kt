package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ApiColor
import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
open class BlockRichText(
    @JsonProperty("rich_text")
    open val richText: List<RichText>,
    open val color: ApiColor
)
