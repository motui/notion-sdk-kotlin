package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.Emoji
import com.mt.notion.common.Icon
import com.mt.notion.common.ObjectType
import com.mt.notion.common.file.ExternalFileDetails
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class CalloutAppendBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Callout,
    val callout: com.mt.notion.api.block.request.append.CalloutAppendBlockRequest.Callout
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest {
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