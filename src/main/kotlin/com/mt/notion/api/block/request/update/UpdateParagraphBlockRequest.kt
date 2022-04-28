package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateParagraphBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Paragraph,
    val paragraph: UpdateBlockRichText
) : UpdateBlockRequest