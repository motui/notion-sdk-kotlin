package com.mt.notion.api.database.request.query

import com.mt.notion.common.Id
import com.mt.notion.common.PropertyType

/**
 * relation
 *
 * @author it.motui
 */
data class QueryRelationProperty(
    override val id: String,
    override val type: PropertyType,
    val relation: List<Id>
) : QueryDatabaseProperty