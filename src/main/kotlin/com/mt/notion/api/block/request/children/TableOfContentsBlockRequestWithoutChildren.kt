package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class TableOfContentsBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.TableOfContents,
    override val objectType: ObjectType = ObjectType.Block,
    @JsonProperty("table_of_contents")
    val tableOfContents: TableOfContents,
) : BlockObjectRequestWithoutChildren {
    data class TableOfContents(
        val color: ApiColor?
    )
}