package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Files
 *
 * @author it.motui
 */
data class CreateDatabaseFilesPropertyRequest(
    override val type: PropertyType = PropertyType.Files,
    val files: EmptyObject
) : WithCreateDatabaseProperty