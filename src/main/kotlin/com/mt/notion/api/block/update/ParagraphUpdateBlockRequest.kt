package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class ParagraphUpdateBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Paragraph,
    val paragraph: UpdateBlockRichText
) : UpdateBlockRequest {

}