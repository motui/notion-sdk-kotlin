package com.mt.notion.api.database.request.filter.property.condition.rollup

/**
 *
 * @author it.motui
 */
data class RollupNumberCondition(
    val number: com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.RollupCondition
