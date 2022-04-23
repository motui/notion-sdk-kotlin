package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.richText.RichText

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
        val caption: List<RichText>?,
        val external: String?
    )
}