package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class NumberPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Number,
    val number: com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition,
) : PropertyFilter
