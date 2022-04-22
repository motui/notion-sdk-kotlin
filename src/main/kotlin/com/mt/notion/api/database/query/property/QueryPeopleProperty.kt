package com.mt.notion.api.database.query.property

import com.mt.notion.api.user.User
import com.mt.notion.common.PropertyType

/**
 * people
 *
 * @author it.motui
 */
data class QueryPeopleProperty(
    override val id: String,
    override val type: PropertyType,
    val people: User
) : QueryDatabaseProperty
