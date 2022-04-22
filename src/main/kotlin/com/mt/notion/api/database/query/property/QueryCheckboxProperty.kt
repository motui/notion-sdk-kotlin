package com.mt.notion.api.database.query.property

import com.mt.notion.common.PropertyType

/**
 * checkbox
 *
 * @author it.motui
 */
data class QueryCheckboxProperty(
    override val id: String,
    override val type: PropertyType,
    val checkbox: Boolean
) : QueryDatabaseProperty
