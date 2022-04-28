package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Link
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendAudioBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Audio,
    val audio: com.mt.notion.api.block.request.append.AppendAudioBlockRequest.Audio,
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest,
    com.mt.notion.api.block.request.append.BlockRequestWithoutChildren {
    data class Audio(
        val caption: List<RichTextRequest>? = null,
        val external: Link,
        val type: String = "external"
    )
}