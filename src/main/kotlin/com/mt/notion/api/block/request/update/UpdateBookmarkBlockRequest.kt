package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdateBookmarkBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Bookmark,
    val bookmark: Bookmark
) : UpdateBlockRequest {
    data class Bookmark(
        val url: String? = null,
        val caption: List<RichTextRequest>? = null
    )
}