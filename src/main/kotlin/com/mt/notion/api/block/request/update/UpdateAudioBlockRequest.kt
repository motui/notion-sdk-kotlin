package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdateAudioBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Audio,
    val audio: Audio
) : UpdateBlockRequest {
    data class Audio(
        val caption: List<RichTextRequest>?,
        val external: String?
    )
}