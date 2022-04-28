package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendHeading2BlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Heading2,
    // TODO: 2022/4/28 待补充
    @JsonProperty("heading_2")
    val heading2: AppendBlockRichText
) : WithAppendBlockRequest {

}