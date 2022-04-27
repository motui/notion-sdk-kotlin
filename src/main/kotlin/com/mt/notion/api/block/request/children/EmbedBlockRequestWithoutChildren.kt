package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class EmbedBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Embed,
    override val objectType: ObjectType = ObjectType.Block,
    val embed: Embed,
) : BlockObjectRequestWithoutChildren {

    data class Embed(
        val url: String,
        val caption: List<RichTextRequest>?
    )
}