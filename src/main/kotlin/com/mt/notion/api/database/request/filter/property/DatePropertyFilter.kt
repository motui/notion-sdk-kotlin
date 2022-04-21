package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class DatePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Date,
    val date: com.mt.notion.api.database.request.filter.property.condition.date.DateCondition,
) : PropertyFilter
