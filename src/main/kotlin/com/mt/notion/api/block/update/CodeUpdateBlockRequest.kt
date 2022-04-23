package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.objects.Language
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class CodeUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.Code,
    val code: Code
) : UpdateBlockRequest {
    data class Code(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>?,
        val caption: List<RichTextRequest>?,
        val language: Language?
    )
}