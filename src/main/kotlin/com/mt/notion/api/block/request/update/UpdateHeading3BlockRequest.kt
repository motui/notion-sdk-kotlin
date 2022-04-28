package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateHeading3BlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Heading3,
    @JsonProperty("heading_3")
    val heading3: UpdateBlockRichText
) : UpdateBlockRequest