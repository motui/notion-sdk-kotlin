package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateBulletedListItemBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.BulletedListItem,
    @JsonProperty("bulleted_list_item")
    val bulletedListItem: UpdateBlockRichText
) : UpdateBlockRequest {

}