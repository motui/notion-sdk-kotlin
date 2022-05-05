package com.mt.notion.api.database.request.query.filter.property.condition.rollup

import com.mt.notion.api.database.request.query.filter.property.condition.rollup.sub.RollupSubCondition

/**
 *
 * @author it.motui
 */
data class NoneCondition(
    val none: RollupSubCondition
) : RollupCondition
