package com.mt.notion.api.block.request.append

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
    val tableRow: com.mt.notion.api.block.request.append.AppendTableRawBlockRequest.TableRaw
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest,
    com.mt.notion.api.block.request.append.BlockRequestWithoutChildren {
    data class TableRaw(
        val cells: List<List<RichTextRequest>>,
    )
}