package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class UrlPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Url,
    val url: com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
) : PropertyFilter
