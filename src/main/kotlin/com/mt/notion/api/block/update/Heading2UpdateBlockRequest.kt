package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class Heading2UpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Heading2,
    @JsonProperty("heading_2")
    val heading2: UpdateBlockRichText
) : UpdateBlockRequest {

}