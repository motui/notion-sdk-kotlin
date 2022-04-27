package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class BulletedListItemBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.BulletedListItem,
    override val objectType: ObjectType = ObjectType.Block,
    @JsonProperty("bulleted_list_item")
    val bulletedListItem: BlockRichTextRequest,
) : BlockObjectRequestWithoutChildren