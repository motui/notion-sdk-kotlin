package com.mt.notion.api.database.request.filter

/**
 *
 * @author it.motui
 */
interface PropertyFilter {
    val property: String
    val type: PropertyFilterType?
}
