package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class TemplateAppendBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Template,
    val template: com.mt.notion.api.block.request.append.TemplateAppendBlockRequest.Template
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest {
    data class Template(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
    )
}