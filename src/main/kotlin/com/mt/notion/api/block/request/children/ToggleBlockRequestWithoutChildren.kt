package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class ToggleBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Toggle,
    override val objectType: ObjectType = ObjectType.Block,
    val toggle: BlockRichTextRequest,
) : BlockObjectRequestWithoutChildren