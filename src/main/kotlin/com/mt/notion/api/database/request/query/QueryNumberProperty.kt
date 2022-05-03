package com.mt.notion.api.database.request.query

import com.mt.notion.common.PropertyType

/**
 * Number
 *
 * @author it.motui
 */
data class QueryNumberProperty(
    override val id: String,
    override val type: PropertyType,
    val number: Number?
) : QueryDatabaseProperty
