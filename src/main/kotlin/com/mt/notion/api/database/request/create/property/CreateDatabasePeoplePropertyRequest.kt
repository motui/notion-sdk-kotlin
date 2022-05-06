package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * people
 *
 * @author it.motui
 */
data class CreateDatabasePeoplePropertyRequest(
    override val type: PropertyType = PropertyType.People,
    val people: EmptyObject
) : WithCreateDatabaseProperty
