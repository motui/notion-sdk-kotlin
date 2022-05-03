package com.mt.notion.api.database.request.query

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

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
