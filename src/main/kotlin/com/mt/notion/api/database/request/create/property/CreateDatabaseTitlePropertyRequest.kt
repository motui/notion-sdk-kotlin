package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Title
 *
 * @author it.motui
 */
data class CreateDatabaseTitlePropertyRequest(
    override val type: PropertyType = PropertyType.Title,
    val title: EmptyObject
) : WithCreateDatabaseProperty
