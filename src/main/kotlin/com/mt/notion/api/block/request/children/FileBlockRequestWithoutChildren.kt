package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class FileBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.File,
    override val objectType: ObjectType = ObjectType.Block,
    val file: BlockObjectRequestWithoutChildrenFile,
) : BlockObjectRequestWithoutChildren