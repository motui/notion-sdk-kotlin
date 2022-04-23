package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class EmbedUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Embed,
    val embed: Embed
) : UpdateBlockRequest {
    data class Embed(
        val url: String?,
        val caption: List<RichTextRequest>?
    )
}