package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * checkbox
 *
 * @author it.motui
 */
data class CreateDatabaseCheckboxPropertyRequest(
    override val type: PropertyType = PropertyType.Checkbox,
    val checkbox: EmptyObject
) : WithCreateDatabaseProperty
