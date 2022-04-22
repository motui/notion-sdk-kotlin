package com.mt.notion.api.database.request.filter.property

import com.mt.notion.api.database.request.filter.property.condition.RelationCondition

/**
 *
 * @author it.motui
 */
data class RelationPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Relation,
    val relation: RelationCondition,
) : PropertyFilter
