package com.mt.notion.api.database.response.query.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.DateRequest

/**
 * Date
 *
 * @author it.motui
 */
data class QueryDatabaseDateProperty(
    override val id: String,
    override val type: PropertyType,
    val date: DateRequest?,
) : WithQueryDatabaseProperty
