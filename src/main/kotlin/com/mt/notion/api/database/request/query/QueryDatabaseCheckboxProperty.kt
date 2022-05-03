package com.mt.notion.api.database.request.query

import com.mt.notion.common.PropertyType

/**
 * checkbox
 *
 * @author it.motui
 */
data class QueryDatabaseCheckboxProperty(
    override val id: String,
    override val type: PropertyType,
    val checkbox: Boolean
) : WithQueryDatabaseProperty
