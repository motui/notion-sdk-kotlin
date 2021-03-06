package com.mt.notion.api.database.response.query.property

import com.mt.notion.common.PropertyType

/**
 * Number
 *
 * @author it.motui
 */
data class QueryDatabaseNumberProperty(
    override val id: String,
    override val type: PropertyType,
    val number: Number?
) : WithQueryDatabaseProperty
