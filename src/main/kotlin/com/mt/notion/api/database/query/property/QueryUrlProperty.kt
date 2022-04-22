package com.mt.notion.api.database.query.property

import com.mt.notion.common.PropertyType

/**
 * Url
 *
 * @author it.motui
 */
data class QueryUrlProperty(
    override val id: String,
    override val type: PropertyType,
    val url: String?
) : QueryDatabaseProperty
