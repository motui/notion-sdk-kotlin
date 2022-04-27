package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class ParagraphBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Paragraph,
    override val objectType: ObjectType = ObjectType.Block,
    val paragraph: BlockRichTextRequest,
) : BlockObjectRequestWithoutChildren