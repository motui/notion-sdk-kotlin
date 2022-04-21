package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class PeoplePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.People,
    val people: com.mt.notion.api.database.request.filter.property.condition.PeopleCondition,
) : PropertyFilter
