package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

/**
 *
 * @author it.motui
 */
data class RollupSubPeopleCondition(
    val people: com.mt.notion.api.database.request.filter.property.condition.PeopleCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
