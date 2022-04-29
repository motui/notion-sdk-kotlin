package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.children.BlockRichTextWithChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendHeading3BlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Heading3,
    @JsonProperty("heading_3")
    val heading3: BlockRichTextWithChildren
) : WithAppendBlockRequest