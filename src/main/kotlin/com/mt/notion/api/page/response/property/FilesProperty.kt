package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.file.name.WithNameFile

/**
 *
 * @author it.motui
 */
data class FilesProperty(
    override val type: PropertyType,
    override val id: String,
    val files: List<WithNameFile>
) : WithProperty
