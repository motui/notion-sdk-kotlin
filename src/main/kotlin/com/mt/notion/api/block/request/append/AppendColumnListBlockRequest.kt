package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendColumnListBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.ColumnList,
    @JsonProperty("column_list")
    val columnList: ColumnList
) : WithAppendBlockRequest {
    data class ColumnList(
        // TODO: 2022/4/28 待补充
        val children: List<AppendColumnBlockRequest>
    )
}