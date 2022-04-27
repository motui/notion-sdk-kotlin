package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class DividerBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Divider,
    override val objectType: ObjectType = ObjectType.Block,
    val divider: EmptyObject,
) : BlockObjectRequestWithoutChildren