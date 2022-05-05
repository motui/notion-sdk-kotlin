package com.mt.notion.api.database.request.query.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.query.filter.property.condition.RelationCondition

/**
 *
 * @author it.motui
 */
data class RollupSubRelationCondition(
    val relation: RelationCondition
) : RollupSubCondition
