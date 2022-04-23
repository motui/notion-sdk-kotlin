package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.Emoji
import com.mt.notion.common.Icon
import com.mt.notion.common.file.ExternalFileDetails
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class CalloutUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Callout,
    val callout: Callout
) : UpdateBlockRequest {
    data class Callout(
        @JsonProperty("rich_text")
        val richText: List<RichText>?,
        /**
         * support [Emoji] and [ExternalFileDetails]
         */
        val icon: Icon?,
        val color: ApiColor?
    )
}