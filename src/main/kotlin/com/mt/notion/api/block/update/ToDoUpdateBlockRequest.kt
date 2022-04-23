package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class ToDoUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.ToDo,
    @JsonProperty("to_do")
    val toDo: ToDo
) : UpdateBlockRequest {
    data class ToDo(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val color: ApiColor?,
        val checked: Boolean?
    )
}