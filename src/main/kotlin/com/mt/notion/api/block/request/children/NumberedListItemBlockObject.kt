package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class NumberedListItemBlockObject(
    override val type: BlockObjectType = BlockObjectType.NumberedListItem,
    override val objectType: ObjectType = ObjectType.Block,
    @JsonProperty("numbered_list_item")
    val numberedListItem: BlockRichTextRequest,
) : BlockObjectRequestWithoutChildren