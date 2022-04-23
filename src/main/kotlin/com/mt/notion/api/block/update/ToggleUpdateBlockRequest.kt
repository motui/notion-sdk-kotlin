package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class ToggleUpdateBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Toggle,
    val toggle: UpdateBlockRichText
) : UpdateBlockRequest {

}