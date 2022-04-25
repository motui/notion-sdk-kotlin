package com.mt.notion.api.block.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Link
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendVideoBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Video,
    val video: Video
) : WithAppendBlockRequest {
    data class Video(
        val caption: List<RichTextRequest>? = null,
        val external: Link,
        val type: String = "external"
    )
}