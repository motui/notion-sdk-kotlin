package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class QuoteAppendBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Quote,
    val quote: com.mt.notion.api.block.request.append.AppendBlockRichText
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest {

}