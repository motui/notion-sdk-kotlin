package com.mt.notion.api.database.request.filter.property

import com.mt.notion.api.database.request.filter.property.condition.rollup.RollupCondition

/**
 *
 * @author it.motui
 */
data class RollupPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Rollup,
    val rollup: RollupCondition,
) : PropertyFilter
