package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdateTableRawBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.TableRow,
    @JsonProperty("table_row")
    val tableRow: com.mt.notion.api.block.request.update.UpdateTableRawBlockRequest.TableRaw
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {
    data class TableRaw(
        val cells: List<List<RichTextRequest>>,
    )
}