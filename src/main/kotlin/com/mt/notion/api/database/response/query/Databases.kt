package com.mt.notion.api.database.response.query

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType
import com.mt.notion.common.response.PaginationResponse
import com.mt.notion.common.response.WithListType

/**
 *
 * @author it.motui
 */
data class Databases(
    override val objectType: ObjectType,
    override val type: String,
    override val nextCursor: String?,
    override val hasMore: Boolean?,
    val page: EmptyObject,
    val results: List<QueryDatabaseResponse>
) : WithListType, PaginationResponse
