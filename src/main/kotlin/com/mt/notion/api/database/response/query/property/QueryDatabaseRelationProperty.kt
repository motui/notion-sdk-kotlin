package com.mt.notion.api.database.response.query.property

import com.mt.notion.common.Id
import com.mt.notion.common.PropertyType

/**
 * relation
 *
 * @author it.motui
 */
data class QueryDatabaseRelationProperty(
    override val id: String,
    override val type: PropertyType,
    val relation: List<Id>
) : WithQueryDatabaseProperty
