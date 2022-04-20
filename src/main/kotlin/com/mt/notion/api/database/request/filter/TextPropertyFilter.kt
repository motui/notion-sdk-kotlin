package com.mt.notion.api.database.request.filter

/**
 *
 * @author it.motui
 */
data class TextPropertyFilter(
    override val property: String,
    override val type: PropertyFilter.Type?

) : PropertyFilter
