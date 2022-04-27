package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class VideoBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Video,
    override val objectType: ObjectType = ObjectType.Block,
    val video: BlockObjectRequestWithoutChildrenFile,
) : BlockObjectRequestWithoutChildren