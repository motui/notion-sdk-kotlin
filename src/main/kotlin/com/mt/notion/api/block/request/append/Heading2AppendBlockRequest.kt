package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class Heading2AppendBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Heading2,
    @JsonProperty("heading_2")
    val heading2: com.mt.notion.api.block.request.append.AppendBlockRichText
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest {

}