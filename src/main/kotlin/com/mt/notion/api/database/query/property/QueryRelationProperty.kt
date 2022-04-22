package com.mt.notion.api.database.query.property

import com.mt.notion.common.IdObject
import com.mt.notion.common.PropertyType

/**
 * relation
 *
 * @author it.motui
 */
data class QueryRelationProperty(
    override val id: String,
    override val type: PropertyType,
    val relation: List<IdObject>
) : QueryDatabaseProperty {

}
