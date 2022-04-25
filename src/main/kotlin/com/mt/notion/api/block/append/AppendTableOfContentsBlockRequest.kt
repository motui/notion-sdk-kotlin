package com.mt.notion.api.block.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendTableOfContentsBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.TableOfContents,
    @JsonProperty("table_of_contents")
    val tableOfContents: TableOfContents
) : WithAppendBlockRequest {
    data class TableOfContents(
        val color: ApiColor? = ApiColor.Default,
    )
}