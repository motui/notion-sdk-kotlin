package com.mt.notion.api.block.request.append.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.BlockRequestWithChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class QuoteBlockRequestWithChildren(
    val objectType: ObjectType = ObjectType.Block,
    val type: BlockObjectType? = BlockObjectType.Quote,
    val quote: BlockRichTextWithChildren
) : BlockRequestWithChildren