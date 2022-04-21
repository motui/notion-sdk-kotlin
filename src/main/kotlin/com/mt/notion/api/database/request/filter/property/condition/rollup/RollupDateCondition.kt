package com.mt.notion.api.database.request.filter.property.condition.rollup

/**
 *
 * @author it.motui
 */
data class RollupDateCondition(
    val date: com.mt.notion.api.database.request.filter.property.condition.date.DateCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.RollupCondition
