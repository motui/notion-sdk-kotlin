package com.mt.notion.api.database.request.query.filter.property

import com.mt.notion.api.database.request.query.filter.property.condition.date.DateCondition

/**
 *
 * @author it.motui
 */
data class DatePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Date,
    val date: DateCondition,
) : PropertyFilter
