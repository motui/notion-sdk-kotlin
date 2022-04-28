package com.mt.notion.api.block.request.append.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.BlockRequestWithChildren
import com.mt.notion.api.block.request.children.BlockObjectRequestWithoutChildren
import com.mt.notion.common.ApiColor
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class ToDoBlockRequestWithChildren(
    val objectType: ObjectType = ObjectType.Block,
    val type: BlockObjectType? = BlockObjectType.ToDo,
    @JsonProperty("to_do")
    val toDo: ToDo
) : BlockRequestWithChildren {

    data class ToDo(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val color: ApiColor? = ApiColor.Default,
        val children: List<BlockObjectRequestWithoutChildren>? = null,
        val checked: Boolean? = null
    )

}