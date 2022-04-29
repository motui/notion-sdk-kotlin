package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendToDoBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.ToDo,
    @JsonProperty("to_do")
    val toDo: ToDo
) : WithAppendBlockRequest {
    data class ToDo(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val color: ApiColor? = ApiColor.Default,
        val checked: Boolean? = false,
        val children: List<BlockRequestWithChildren>? = null
    )
}