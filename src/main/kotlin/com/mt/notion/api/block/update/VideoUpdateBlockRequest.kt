package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class VideoUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType?,
    val video: Video
) : UpdateBlockRequest {
    data class Video(
        val caption: List<RichText>?,
        val external: String?
    )
}