package com.mt.notion.api.block

import com.mt.notion.api.block.objects.WithBlockObject
import com.mt.notion.common.ObjectType
import com.mt.notion.common.WithListType
import com.mt.notion.common.response.PaginationResponse

/**
 *
 * @author it.motui
 */
data class Blocks(
    override val objectType: ObjectType,
    override val nextCursor: String?,
    override val hasMore: Boolean?,
    override val type: String,
    val results: List<WithBlockObject>
) : WithListType, PaginationResponse
