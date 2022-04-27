package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class QuoteBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Quote,
    override val objectType: ObjectType = ObjectType.Block,
    val quote: BlockRichTextRequest,
) : BlockObjectRequestWithoutChildren