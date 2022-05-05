package com.mt.notion.api.database.request.query.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.query.filter.property.condition.number.NumberCondition

/**
 *
 * @author it.motui
 */
data class RollupSubNumberCondition(
    val number: NumberCondition
) : RollupSubCondition
