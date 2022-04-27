package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Language
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdateCodeBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Code,
    val code: com.mt.notion.api.block.request.update.UpdateCodeBlockRequest.Code
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {
    data class Code(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>? = null,
        val caption: List<RichTextRequest>? = null,
        val language: Language? = null
    )
}