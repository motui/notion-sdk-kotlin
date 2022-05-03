package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 *
 * @author it.motui
 */
data class PageSelectProperty(
    override val type: PropertyType,
    override val id: String,
    val select: SelectPropertyResponse?
) : WithPageProperty
