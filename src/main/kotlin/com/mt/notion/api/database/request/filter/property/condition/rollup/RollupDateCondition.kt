package com.mt.notion.api.database.request.filter.property.condition.rollup

import com.mt.notion.api.database.request.filter.property.condition.date.DateCondition

/**
 *
 * @author it.motui
 */
data class RollupDateCondition(
    val date: DateCondition
) : RollupCondition
