package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Language
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendCodeBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Code,
    val code: com.mt.notion.api.block.request.append.AppendCodeBlockRequest.Code
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest,
    com.mt.notion.api.block.request.append.BlockRequestWithoutChildren {
    data class Code(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val caption: List<RichTextRequest>? = null,
        val language: Language
    )
}