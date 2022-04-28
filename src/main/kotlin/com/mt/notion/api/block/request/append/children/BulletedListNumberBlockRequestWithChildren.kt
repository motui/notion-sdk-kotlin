package com.mt.notion.api.block.request.append.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.BlockRequestWithChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class BulletedListNumberBlockRequestWithChildren(
    val objectType: ObjectType = ObjectType.Block,
    val type: BlockObjectType? = BlockObjectType.BulletedListItem,
    @JsonProperty("bulleted_list_item")
    val bulletedListItem: BlockRichTextWithChildren
) : BlockRequestWithChildren