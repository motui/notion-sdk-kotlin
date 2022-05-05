package com.mt.notion.api.database.request.query.filter

/**
 *
 * @author it.motui
 */
data class OrFilter(
    val or: List<Filter>
) : Filter
