package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

/**
 *
 * @author it.motui
 */
data class RollupSubNumberCondition(
    val number: com.mt.notion.api.database.request.filter.property.condition.number.NumberCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
