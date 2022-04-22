package com.mt.notion.api.database

import com.mt.notion.api.database.query.BaseQueryDatabaseResponse
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType
import com.mt.notion.common.PaginationResponse
import com.mt.notion.common.WithListType

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
    val results: List<BaseQueryDatabaseResponse>
) : WithListType, PaginationResponse
