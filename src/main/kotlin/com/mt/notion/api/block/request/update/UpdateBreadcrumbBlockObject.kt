package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject

/**
 *
 * @author it.motui
 */
data class UpdateBreadcrumbBlockObject(
    val type: BlockObjectType? = BlockObjectType.Breadcrumb,
    override val archived: Boolean = false,
    val breadcrumb: EmptyObject,
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {

}