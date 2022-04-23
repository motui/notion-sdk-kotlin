package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ApiColor
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
open class UpdateBlockRichText(
    @JsonProperty("rich_text")
    open val richText: List<RichText>,
    open val color: ApiColor?
)
