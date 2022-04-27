package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ApiColor
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
open class BlockRichTextRequest(
    @JsonProperty("rich_text")
    open val richText: List<RichTextRequest>,
    open val color: ApiColor?
)
