package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.request.richText.RichTextRequest
import com.mt.notion.common.response.file.Emoji
import com.mt.notion.common.response.file.ExternalFileDetails
import com.mt.notion.common.response.file.Icon

/**
 *
 * @author it.motui
 */
data class UpdateCalloutBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Callout,
    val callout: Callout
) : UpdateBlockRequest {
    data class Callout(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>? = null,
        /**
         * support [Emoji] and [ExternalFileDetails]
         */
        val icon: Icon? = null,
        val color: ApiColor? = ApiColor.Default
    )
}