package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class ImageBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Image,
    override val objectType: ObjectType = ObjectType.Block,
    val image: BlockObjectRequestWithoutChildrenFile,
) : BlockObjectRequestWithoutChildren