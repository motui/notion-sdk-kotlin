package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class AudioUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Audio,
    val audio: Audio
) : UpdateBlockRequest {
    data class Audio(
        val caption: List<RichText>?,
        val external: String?
    )
}