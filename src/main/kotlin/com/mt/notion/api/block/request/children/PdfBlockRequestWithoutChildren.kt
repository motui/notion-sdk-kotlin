package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class PdfBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Pdf,
    override val objectType: ObjectType = ObjectType.Block,
    val pdf: BlockObjectRequestWithoutChildrenFile,
) : BlockObjectRequestWithoutChildren