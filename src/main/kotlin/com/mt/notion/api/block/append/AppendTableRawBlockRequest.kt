package com.mt.notion.api.block.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class AppendTableRawBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.TableRow,
    @JsonProperty("table_row")
    val tableRow: TableRaw
) : WithAppendBlockRequest {
    data class TableRaw(
        val cells: List<List<RichTextRequest>>,
    )
}