package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PageCheckboxProperty(
    override val type: PropertyType,
    override val id: String,
    val checkbox: Boolean
) : WithPageProperty
