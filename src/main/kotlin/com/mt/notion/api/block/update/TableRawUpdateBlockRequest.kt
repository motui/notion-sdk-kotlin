package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class TableRawUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.TableRow,
    @JsonProperty("table_row")
    val tableRow: TableRaw
) : UpdateBlockRequest {
    data class TableRaw(
        val cells: List<List<RichText>>,
    )
}