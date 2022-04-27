package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class Heading3BlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Heading3,
    override val objectType: ObjectType = ObjectType.Block,
    val heading_3: BlockRichTextRequest,
) : BlockObjectRequestWithoutChildren