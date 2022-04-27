package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class TemplateBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Template,
    override val objectType: ObjectType = ObjectType.Block,
    val template: TemplateRichText,
) : BlockObjectRequestWithoutChildren {
    data class TemplateRichText(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>
    )
}