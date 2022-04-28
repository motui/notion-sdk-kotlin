package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdateVideoBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Video,
    val video: Video
) : UpdateBlockRequest {
    data class Video(
        val caption: List<RichTextRequest>? = null,
        val external: String? = null
    )
}