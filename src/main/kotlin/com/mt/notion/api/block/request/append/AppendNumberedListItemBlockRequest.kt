package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.children.BlockRichTextWithChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendNumberedListItemBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.NumberedListItem,
    @JsonProperty("numbered_list_item")
    val numberedListItem: BlockRichTextWithChildren
) : WithAppendBlockRequest