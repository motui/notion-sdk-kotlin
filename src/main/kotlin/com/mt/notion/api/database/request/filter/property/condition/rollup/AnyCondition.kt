package com.mt.notion.api.database.request.filter.property.condition.rollup

/**
 *
 * @author it.motui
 */
data class AnyCondition(
    val any: com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.RollupCondition
