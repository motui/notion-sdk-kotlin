package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendParagraphBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Paragraph,
    // TODO: 2022/4/28 待补充
    val paragraph: AppendBlockRichText
) : WithAppendBlockRequest {

}