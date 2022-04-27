package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendColumnBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.ColumnList,
    val column_list: ColumnList
) : WithAppendBlockRequest {
    data class ColumnList(
        val children: List<WithChildrenBlockRequest>
    )
}