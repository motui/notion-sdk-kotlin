package com.mt.notion.api.block.request.append.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.request.children.BlockObjectRequestWithoutChildren
import com.mt.notion.common.ApiColor
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
open class BlockRichTextWithChildren(
    @JsonProperty("rich_text")
    open val richText: List<RichTextRequest>,
    open val color: ApiColor? = ApiColor.Default,
    val children: List<BlockObjectRequestWithoutChildren>? = null
)
