package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdateImageBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Image,
    val image: com.mt.notion.api.block.request.update.UpdateImageBlockRequest.Image
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {
    data class Image(
        val caption: List<RichTextRequest>? = null,
        val external: String? = null
    )
}