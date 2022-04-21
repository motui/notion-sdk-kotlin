package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class EmailPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Email,
    val email: com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
) : PropertyFilter
