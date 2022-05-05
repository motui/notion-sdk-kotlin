package com.mt.notion.api.database.request.query.filter.property

import com.mt.notion.api.database.request.query.filter.Filter


/**
 *
 * @author it.motui
 */
interface PropertyFilter : Filter {
    val property: String
    val type: PropertyFilterType?
}
