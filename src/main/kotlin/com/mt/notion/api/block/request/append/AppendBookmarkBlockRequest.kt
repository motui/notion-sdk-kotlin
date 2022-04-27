package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendBookmarkBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Bookmark,
    val bookmark: com.mt.notion.api.block.request.append.AppendBookmarkBlockRequest.Bookmark
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest,
    com.mt.notion.api.block.request.append.WithChildrenBlockRequest {
    data class Bookmark(
        val url: String,
        val caption: List<RichTextRequest>? = null
    )
}