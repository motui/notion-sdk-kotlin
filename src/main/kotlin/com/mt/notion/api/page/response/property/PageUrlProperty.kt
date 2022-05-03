package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PageUrlProperty(
    override val type: PropertyType,
    override val id: String,
    val url: String?
) : WithPageProperty
