package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateHeading2BlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Heading2,
    @JsonProperty("heading_2")
    val heading2: com.mt.notion.api.block.request.update.UpdateBlockRichText
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {

}