package com.mt.notion.api.database.request.query.filter.property

import com.mt.notion.api.database.request.query.filter.property.condition.RelationCondition

/**
 *
 * @author it.motui
 */
data class RelationPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Relation,
    val relation: RelationCondition,
) : PropertyFilter
