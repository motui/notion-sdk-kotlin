package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Url
 *
 * @author it.motui
 */
data class CreateDatabaseUrlPropertyRequest(
    override val type: PropertyType = PropertyType.Url,
    val url: EmptyObject
) : WithCreateDatabaseProperty
