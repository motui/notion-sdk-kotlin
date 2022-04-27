package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class ToDoBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.ToDo,
    override val objectType: ObjectType = ObjectType.Block,
    @JsonProperty("to_do")
    val toDo: ToDoRichText,
) : BlockObjectRequestWithoutChildren {

    data class ToDoRichText(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val color: ApiColor? = null,
        val checked: Boolean? = null
    )
}