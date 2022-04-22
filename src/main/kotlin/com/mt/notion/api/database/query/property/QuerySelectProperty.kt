package com.mt.notion.api.database.query.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.SelectPropertyResponse

/**
 * Select
 *
 * @author it.motui
 */
data class QuerySelectProperty(
    override val id: String,
    override val type: PropertyType,
    val select: SelectPropertyResponse
) : QueryDatabaseProperty
