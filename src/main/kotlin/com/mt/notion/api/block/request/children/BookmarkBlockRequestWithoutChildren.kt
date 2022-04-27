package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class BookmarkBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Bookmark,
    override val objectType: ObjectType = ObjectType.Block,
    val bookmark: Bookmark,
) : BlockObjectRequestWithoutChildren {

    data class Bookmark(
        val url: String,
        val caption: List<RichTextRequest>?
    )
}