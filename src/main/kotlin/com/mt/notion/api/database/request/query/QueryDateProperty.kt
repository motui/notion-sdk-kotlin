package com.mt.notion.api.database.request.query

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.DateRequest

/**
 * Date
 *
 * @author it.motui
 */
data class QueryDateProperty(
    override val id: String,
    override val type: PropertyType,
    val date: DateRequest?,
) : QueryDatabaseProperty
