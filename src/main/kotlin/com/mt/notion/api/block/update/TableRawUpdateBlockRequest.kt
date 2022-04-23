package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class TableRawUpdateBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.TableRow,
    @JsonProperty("table_row")
    val tableRow: TableRaw
) : UpdateBlockRequest {
    data class TableRaw(
        val cells: List<List<RichTextRequest>>,
    )
}