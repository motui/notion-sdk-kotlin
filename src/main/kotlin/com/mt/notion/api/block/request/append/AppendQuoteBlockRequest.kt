package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendQuoteBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Quote,
    // TODO: 2022/4/28 待补充
    val quote: AppendBlockRichText
) : WithAppendBlockRequest {

}