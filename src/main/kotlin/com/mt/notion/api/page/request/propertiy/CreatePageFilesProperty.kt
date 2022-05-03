package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.file.name.WithNameFileRequest

/**
 *
 * @author it.motui
 */
data class CreatePageFilesProperty(
    override val type: PropertyType = PropertyType.Files,
    val files: List<WithNameFileRequest>
) : WithCreatePageProperty
