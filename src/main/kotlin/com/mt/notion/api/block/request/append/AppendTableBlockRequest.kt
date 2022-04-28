package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.children.BlockObjectRequestWithoutChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendTableBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Table,
    val table: Table
) : WithAppendBlockRequest {
    data class Table(
        @JsonProperty("table_width")
        val tableWidth: Number,
        @JsonProperty("has_column_header")
        val hasColumnHeader: Boolean? = false,
        @JsonProperty("has_row_header")
        val hasRowHeader: Boolean? = false,
        val children: List<BlockObjectRequestWithoutChildren>
    )

}