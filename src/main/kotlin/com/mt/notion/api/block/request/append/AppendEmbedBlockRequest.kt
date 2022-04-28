package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendEmbedBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Embed,
    val embed: Embed
) : WithAppendBlockRequest,
    BlockRequestWithChildren {
    data class Embed(
        val url: String,
        val caption: List<RichTextRequest>?
    )
}