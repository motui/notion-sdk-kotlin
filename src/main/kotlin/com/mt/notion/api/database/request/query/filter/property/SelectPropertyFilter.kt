package com.mt.notion.api.database.request.query.filter.property

import com.mt.notion.api.database.request.query.filter.property.condition.SelectCondition

/**
 *
 * @author it.motui
 */
data class SelectPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Select,
    val select: SelectCondition,
) : PropertyFilter
