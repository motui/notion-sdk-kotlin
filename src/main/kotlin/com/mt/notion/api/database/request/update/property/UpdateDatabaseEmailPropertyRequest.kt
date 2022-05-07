package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Email
 *
 * @author it.motui
 */
data class UpdateDatabaseEmailPropertyRequest(
    override val type: PropertyType = PropertyType.Email,
    override val name: String? = null,
    val email: EmptyObject
) : WithUpdateDatabaseProperty
