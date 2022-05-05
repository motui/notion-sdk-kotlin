package com.mt.notion.api.database.request.query.property

import com.mt.notion.common.PropertyType

/**
 * Email
 *
 * @author it.motui
 */
data class QueryDatabaseEmailProperty(
    override val id: String,
    override val type: PropertyType,
    val email: String?
) : WithQueryDatabaseProperty
