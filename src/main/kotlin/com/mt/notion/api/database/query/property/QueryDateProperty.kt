package com.mt.notion.api.database.query.property

import com.mt.notion.common.DateResponse
import com.mt.notion.common.PropertyType

/**
 * Date
 *
 * @author it.motui
 */
data class QueryDateProperty(
    override val id: String,
    override val type: PropertyType,
    val date: DateResponse?,
) : QueryDatabaseProperty
