package com.mt.notion.api.search.request

import com.mt.notion.common.request.PaginationRequest

/**
 *
 * @author it.motui
 */
data class SearchRequest(
    override var startCursor: String?,
    override var pageSize: Int?,
    var sort: Sort? = null,
    val query: String? = null,
    val filter: Filter? = null
) : PaginationRequest