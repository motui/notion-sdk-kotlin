package com.mt.notion.api.block.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.objects.Language
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendCodeBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Code,
    val code: Code
) : WithAppendBlockRequest {
    data class Code(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val caption: List<RichTextRequest>? = null,
        val language: Language
    )
}