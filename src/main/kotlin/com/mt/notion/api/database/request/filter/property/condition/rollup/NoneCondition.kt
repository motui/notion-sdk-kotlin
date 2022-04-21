package com.mt.notion.api.database.request.filter.property.condition.rollup

/**
 *
 * @author it.motui
 */
data class NoneCondition(
    val none: com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.RollupCondition
