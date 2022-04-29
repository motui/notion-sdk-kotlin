package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendTemplateBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Template,
    val template: Template
) : WithAppendBlockRequest {
    data class Template(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val children: List<BlockRequestWithChildren>? = null
    )
}