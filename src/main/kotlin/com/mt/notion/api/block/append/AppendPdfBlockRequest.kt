package com.mt.notion.api.block.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Link
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendPdfBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Pdf,
    val pdf: Pdf
) : WithAppendBlockRequest {
    data class Pdf(
        val caption: List<RichTextRequest>? = null,
        val external: Link,
        val type: String = "external"
    )
}