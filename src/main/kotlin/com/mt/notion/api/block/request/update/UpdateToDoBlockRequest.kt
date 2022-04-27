package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdateToDoBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.ToDo,
    @JsonProperty("to_do")
    val toDo: com.mt.notion.api.block.request.update.UpdateToDoBlockRequest.ToDo
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {
    data class ToDo(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val color: ApiColor? = ApiColor.Default,
        val checked: Boolean? = false
    )
}