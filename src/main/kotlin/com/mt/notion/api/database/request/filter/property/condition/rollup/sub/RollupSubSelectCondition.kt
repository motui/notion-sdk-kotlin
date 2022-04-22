package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.filter.property.condition.SelectCondition

/**
 *
 * @author it.motui
 */
data class RollupSubSelectCondition(
    val select: SelectCondition
) : RollupSubCondition
