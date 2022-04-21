package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

/**
 *
 * @author it.motui
 */
data class RollupSubDateCondition(
    val date: com.mt.notion.api.database.request.filter.property.condition.date.DateCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
