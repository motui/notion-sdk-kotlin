package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.children.BlockRichTextWithChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendToggleBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Toggle,
    val toggle: BlockRichTextWithChildren
) : WithAppendBlockRequest