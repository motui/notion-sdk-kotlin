package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Date
 *
 * @author it.motui
 */
data class UpdateDatabaseDatePropertyRequest(
    override val type: PropertyType = PropertyType.Date,
    override val name: String? = null,
    val date: EmptyObject
) : WithUpdateDatabaseProperty
