package com.mt.notion.api.database.request.filter.property

import com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition

/**
 *
 * @author it.motui
 */
data class NumberPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Number,
    val number: NumberCondition,
) : PropertyFilter
