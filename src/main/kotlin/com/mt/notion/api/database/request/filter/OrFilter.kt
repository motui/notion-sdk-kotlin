package com.mt.notion.api.database.request.filter

/**
 *
 * @author it.motui
 */
data class OrFilter(
    val or: List<Filter>
) : Filter
