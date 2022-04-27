package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class BreadcrumbBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Breadcrumb,
    override val objectType: ObjectType = ObjectType.Block,
    val breadcrumb: EmptyObject,
) : BlockObjectRequestWithoutChildren