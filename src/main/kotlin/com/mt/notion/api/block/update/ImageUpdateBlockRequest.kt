package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class ImageUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Image,
    val image: Image
) : UpdateBlockRequest {
    data class Image(
        val caption: List<RichTextRequest>?,
        val external: String?
    )
}