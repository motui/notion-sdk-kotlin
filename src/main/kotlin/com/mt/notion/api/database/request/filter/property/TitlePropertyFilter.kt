package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class TitlePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Title,
    val title: com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
) : PropertyFilter
