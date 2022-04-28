package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Link
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendImageBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Image,
    val image: Image
) : WithAppendBlockRequest,
    BlockRequestWithChildren {
    data class Image(
        val caption: List<RichTextRequest>? = null,
        val external: Link,
        val type: String = "external"
    )
}