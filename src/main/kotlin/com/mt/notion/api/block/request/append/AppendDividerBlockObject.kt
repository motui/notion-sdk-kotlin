package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendDividerBlockObject(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Divider,
    val divider: EmptyObject,
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest,
    com.mt.notion.api.block.request.append.BlockRequestWithoutChildren {

}