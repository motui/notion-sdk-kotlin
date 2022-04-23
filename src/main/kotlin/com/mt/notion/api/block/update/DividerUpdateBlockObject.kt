package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject

/**
 *
 * @author it.motui
 */
data class DividerUpdateBlockObject(
    val type: BlockObjectType? = BlockObjectType.Divider,
    override val archived: Boolean,
    val divider: EmptyObject,
) : UpdateBlockRequest {

}