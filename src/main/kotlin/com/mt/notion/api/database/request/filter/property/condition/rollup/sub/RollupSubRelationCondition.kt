package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.filter.property.condition.RelationCondition

/**
 *
 * @author it.motui
 */
data class RollupSubRelationCondition(
    val relation: RelationCondition
) : RollupSubCondition
