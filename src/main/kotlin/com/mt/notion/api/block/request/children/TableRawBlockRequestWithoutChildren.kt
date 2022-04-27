package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
data class TableRawBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.TableRow,
    override val objectType: ObjectType = ObjectType.Block,
    @JsonProperty("table_row")
    val tableRow: TableRaw,
) : BlockObjectRequestWithoutChildren {

    data class TableRaw(
        val cells: List<List<RichText>>
    )
}