package com.mt.notion.api.block.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class EmbedAppendBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Embed,
    val embed: Embed
) : WithAppendBlockRequest {
    data class Embed(
        val url: String,
        val caption: List<RichTextRequest>?
    )
}