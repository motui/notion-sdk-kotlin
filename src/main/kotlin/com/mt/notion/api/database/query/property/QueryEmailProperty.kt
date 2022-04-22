package com.mt.notion.api.database.query.property

import com.mt.notion.common.PropertyType

/**
 * Email
 *
 * @author it.motui
 */
data class QueryEmailProperty(
    override val id: String,
    override val type: PropertyType,
    val email: String?
) : QueryDatabaseProperty
