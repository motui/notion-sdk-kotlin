package com.mt.notion.api.block.request.append.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.BlockRequestWithChildren
import com.mt.notion.api.block.request.children.BlockObjectRequestWithoutChildren
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class TemplateBlockRequestWithChildren(
    val objectType: ObjectType = ObjectType.Block,
    val type: BlockObjectType? = BlockObjectType.Template,
    val template: Template
) : BlockRequestWithChildren {

    data class Template(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val children: List<BlockObjectRequestWithoutChildren>? = null
    )

}