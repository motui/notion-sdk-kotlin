package com.mt.notion.api.database.request.query.property

import com.mt.notion.common.PropertyType

/**
 * Url
 *
 * @author it.motui
 */
data class QueryDatabaseUrlProperty(
    override val id: String,
    override val type: PropertyType,
    val url: String?
) : WithQueryDatabaseProperty
