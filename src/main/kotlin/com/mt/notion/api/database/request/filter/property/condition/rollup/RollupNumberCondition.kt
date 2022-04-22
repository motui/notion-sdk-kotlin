package com.mt.notion.api.database.request.filter.property.condition.rollup

import com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition

/**
 *
 * @author it.motui
 */
data class RollupNumberCondition(
    val number: NumberCondition
) : RollupCondition
