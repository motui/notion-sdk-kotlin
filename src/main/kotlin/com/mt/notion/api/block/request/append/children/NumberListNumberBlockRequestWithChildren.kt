package com.mt.notion.api.block.request.append.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.BlockRequestWithChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class NumberListNumberBlockRequestWithChildren(
    val objectType: ObjectType = ObjectType.Block,
    val type: BlockObjectType? = BlockObjectType.NumberedListItem,
    @JsonProperty("numbered_list_item")
    val numberedListItem: BlockRichTextWithChildren
) : BlockRequestWithChildren