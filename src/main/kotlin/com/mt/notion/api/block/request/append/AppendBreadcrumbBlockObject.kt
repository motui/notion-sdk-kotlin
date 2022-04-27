package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendBreadcrumbBlockObject(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Breadcrumb,
    val breadcrumb: EmptyObject,
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest,
    com.mt.notion.api.block.request.append.WithChildrenBlockRequest {

}