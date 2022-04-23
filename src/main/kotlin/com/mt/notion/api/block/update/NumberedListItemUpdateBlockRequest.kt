package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class NumberedListItemUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.NumberedListItem,
    @JsonProperty("numbered_list_item")
    val numberedListItem: UpdateBlockRichText
) : UpdateBlockRequest {

}