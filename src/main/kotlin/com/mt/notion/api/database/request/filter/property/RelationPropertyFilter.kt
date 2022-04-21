package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class RelationPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Relation,
    val relation: com.mt.notion.api.database.request.filter.property.condition.RelationCondition,
) : PropertyFilter
