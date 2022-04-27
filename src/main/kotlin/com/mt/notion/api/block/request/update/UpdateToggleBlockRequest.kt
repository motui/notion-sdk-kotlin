package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateToggleBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Toggle,
    val toggle: com.mt.notion.api.block.request.update.UpdateBlockRichText
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {

}