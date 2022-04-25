package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject

/**
 *
 * @author it.motui
 */
data class UpdateDividerBlockObject(
    val type: BlockObjectType? = BlockObjectType.Divider,
    override val archived: Boolean = false,
    val divider: EmptyObject,
) : UpdateBlockRequest {

}