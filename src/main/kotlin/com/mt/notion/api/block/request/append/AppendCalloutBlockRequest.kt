package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.Icon
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendCalloutBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Callout,
    val callout: Callout
) : WithAppendBlockRequest {
    data class Callout(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>? = null,
        val icon: Icon? = null,
        val color: ApiColor? = ApiColor.Default,
        val children: List<BlockRequestWithChildren>? = null
    )
}