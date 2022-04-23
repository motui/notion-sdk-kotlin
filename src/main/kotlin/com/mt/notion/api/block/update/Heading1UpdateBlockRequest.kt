package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class Heading1UpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Heading1,
    @JsonProperty("heading_1")
    val heading1: UpdateBlockRichText
) : UpdateBlockRequest {

}