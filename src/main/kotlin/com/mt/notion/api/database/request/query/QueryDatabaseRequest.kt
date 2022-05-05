package com.mt.notion.api.database.request.query

import com.mt.notion.api.database.request.query.filter.Filter
import com.mt.notion.api.database.request.query.sort.Sort
import com.mt.notion.common.request.PaginationRequest

/**
 * database query
 *
 * @author it.motui
 */
data class QueryDatabaseRequest(
    val sorts: List<Sort>? = null,
    val filter: List<Filter>? = null,
    override var startCursor: String? = null,
    override var pageSize: Int? = null,
    val archived: Boolean? = null
) : PaginationRequest
