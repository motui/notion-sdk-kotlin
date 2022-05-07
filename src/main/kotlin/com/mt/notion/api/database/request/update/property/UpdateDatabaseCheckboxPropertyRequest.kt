package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * checkbox
 *
 * @author it.motui
 */
data class UpdateDatabaseCheckboxPropertyRequest(
    override val type: PropertyType = PropertyType.Checkbox,
    override val name: String? = null,
    val checkbox: EmptyObject,
) : WithUpdateDatabaseProperty
