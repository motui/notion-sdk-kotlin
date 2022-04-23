package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject

/**
 *
 * @author it.motui
 */
data class BreadcrumbUpdateBlockObject(
    val type: BlockObjectType? = BlockObjectType.Breadcrumb,
    override val archived: Boolean = false,
    val breadcrumb: EmptyObject,
) : UpdateBlockRequest {

}