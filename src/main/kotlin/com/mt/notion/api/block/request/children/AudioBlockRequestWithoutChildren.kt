package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AudioBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Audio,
    override val objectType: ObjectType = ObjectType.Block,
    val audio: BlockObjectRequestWithoutChildrenFile,
) : BlockObjectRequestWithoutChildren