package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class TemplateUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Template,
    val template: Template
) : UpdateBlockRequest {
    data class Template(
        @JsonProperty("rich_text")
        val richText: List<RichText>,
    )
}