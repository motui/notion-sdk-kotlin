package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Date
 *
 * @author it.motui
 */
data class CreateDatabaseDatePropertyRequest(
    override val type: PropertyType = PropertyType.Date,
    val date: EmptyObject
) : WithCreateDatabaseProperty
