package com.mt.notion.api.database.request.filter.property.condition.rollup

import com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition


/**
 *
 * @author it.motui
 */
data class AnyCondition(
    val any: RollupSubCondition
) : RollupCondition