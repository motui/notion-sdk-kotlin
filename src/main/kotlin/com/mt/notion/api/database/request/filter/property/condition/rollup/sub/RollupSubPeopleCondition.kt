package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.filter.property.condition.PeopleCondition

/**
 *
 * @author it.motui
 */
data class RollupSubPeopleCondition(
    val people: PeopleCondition
) : RollupSubCondition
