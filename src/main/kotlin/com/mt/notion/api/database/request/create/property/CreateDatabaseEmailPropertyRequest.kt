package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Email
 *
 * @author it.motui
 */
data class CreateDatabaseEmailPropertyRequest(
    override val type: PropertyType = PropertyType.Email,
    val email: EmptyObject
) : WithCreateDatabaseProperty
