package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * people
 *
 * @author it.motui
 */
data class UpdateDatabasePeoplePropertyRequest(
    override val type: PropertyType = PropertyType.People,
    override val name: String? = null,
    val people: EmptyObject
) : WithUpdateDatabaseProperty
