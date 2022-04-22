package com.mt.notion.api.database.request.filter.property

import com.mt.notion.api.database.request.filter.property.condition.PeopleCondition

/**
 *
 * @author it.motui
 */
data class PeoplePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.People,
    val people: PeopleCondition,
) : PropertyFilter
