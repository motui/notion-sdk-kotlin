package com.mt.notion.api.block.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class BreadcrumbAppendBlockObject(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Breadcrumb,
    val breadcrumb: EmptyObject,
) : WithAppendBlockRequest {

}