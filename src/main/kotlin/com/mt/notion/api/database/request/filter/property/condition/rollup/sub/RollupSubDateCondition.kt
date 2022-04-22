package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.filter.property.condition.date.DateCondition

/**
 *
 * @author it.motui
 */
data class RollupSubDateCondition(
    val date: DateCondition
) : RollupSubCondition
