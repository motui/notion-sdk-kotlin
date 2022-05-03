package com.mt.notion.api.page.response.property.objects

import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 *
 * @author it.motui
 */
data class PageObjectSelectProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    val select: SelectPropertyResponse?
) : WithPageObjectProperty
