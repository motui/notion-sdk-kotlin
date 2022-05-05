package com.mt.notion.api.database.request.query.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 * Select
 *
 * @author it.motui
 */
data class QueryDatabaseSelectProperty(
    override val id: String,
    override val type: PropertyType,
    val select: SelectPropertyResponse
) : WithQueryDatabaseProperty
