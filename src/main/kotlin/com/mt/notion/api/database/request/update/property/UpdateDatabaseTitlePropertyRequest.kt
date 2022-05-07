package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Title
 *
 * @author it.motui
 */
data class UpdateDatabaseTitlePropertyRequest(
    override val type: PropertyType = PropertyType.Title,
    override val name: String? = null,
    val title: EmptyObject
) : WithUpdateDatabaseProperty
