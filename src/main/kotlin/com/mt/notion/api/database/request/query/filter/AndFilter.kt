package com.mt.notion.api.database.request.query.filter

/**
 *
 * @author it.motui
 */
data class AndFilter(
    val and: List<Filter>
) : Filter
