package com.mt.notion.api.block.request.children

import com.mt.notion.common.Link
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class BlockObjectRequestWithoutChildrenFile(
    val external: Link?,
    val type: String = "external",
    val caption: List<RichTextRequest>?
)