package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Files
 *
 * @author it.motui
 */
data class UpdateDatabaseFilesPropertyRequest(
    override val type: PropertyType = PropertyType.Files,
    override val name: String? = null,
    val files: EmptyObject
) : WithUpdateDatabaseProperty