package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateTableBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Table,
    val table: Table
) : UpdateBlockRequest {
    data class Table(
        @JsonProperty("has_column_header")
        val hasColumnHeader: Boolean? = false,
        @JsonProperty("has_row_header")
        val hasRowHeader: Boolean? = false,
    )

}