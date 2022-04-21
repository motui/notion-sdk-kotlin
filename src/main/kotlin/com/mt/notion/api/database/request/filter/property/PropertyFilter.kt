package com.mt.notion.api.database.request.filter.property

import java.util.logging.Filter

/**
 *
 * @author it.motui
 */
interface PropertyFilter : Filter {
    val property: String
    val type: PropertyFilterType?
}
