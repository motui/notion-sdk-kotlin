package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class BookmarkUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Bookmark,
    val bookmark: Bookmark
) : UpdateBlockRequest {
    data class Bookmark(
        val url: String?,
        val caption: List<RichText>?
    )
}