package com.mt.notion.api.page.response.property.objects

import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.file.name.WithNameFile

/**
 *
 * @author it.motui
 */
data class PageObjectFilesProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    val files: List<WithNameFile>
) : WithPageObjectProperty
