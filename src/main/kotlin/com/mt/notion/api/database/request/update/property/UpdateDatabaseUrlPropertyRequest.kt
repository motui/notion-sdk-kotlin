package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Url
 *
 * @author it.motui
 */
data class UpdateDatabaseUrlPropertyRequest(
    override val type: PropertyType = PropertyType.Url,
    override val name: String? = null,
    val url: EmptyObject
) : WithUpdateDatabaseProperty
