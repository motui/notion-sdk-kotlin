package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class UrlProperty(
    override val type: PropertyType,
    override val id: String,
    val url: String?
) : WithProperty
