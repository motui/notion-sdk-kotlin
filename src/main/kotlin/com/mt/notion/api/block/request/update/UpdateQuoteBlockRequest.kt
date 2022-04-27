package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateQuoteBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Quote,
    val quote: com.mt.notion.api.block.request.update.UpdateBlockRichText
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {

}