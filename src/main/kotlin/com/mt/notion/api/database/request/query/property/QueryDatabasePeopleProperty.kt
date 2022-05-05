package com.mt.notion.api.database.request.query.property

import com.mt.notion.api.user.User
import com.mt.notion.common.PropertyType

/**
 * people
 *
 * @author it.motui
 */
data class QueryDatabasePeopleProperty(
    override val id: String,
    override val type: PropertyType,
    val people: User
) : WithQueryDatabaseProperty
