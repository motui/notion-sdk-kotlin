package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ApiColor
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
open class AppendBlockRichText(
    @JsonProperty("rich_text")
    open val richText: List<RichTextRequest>,
    open val color: ApiColor? = ApiColor.Default
)
