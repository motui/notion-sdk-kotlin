package com.mt.notion.api.database.request

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.Filter
import com.mt.notion.api.database.request.sort.Sort

/**
 * database query
 *
 * @author it.mtui
 */
data class DatabaseQuery(
    val sorts: List<Sort>?,
    val files: List<Filter>?,

    @JsonProperty("start_cursor")
    val startCursor: String?,
    @JsonProperty("page_size")
    val pageSize: Number?,
    val archived: Boolean?
)
