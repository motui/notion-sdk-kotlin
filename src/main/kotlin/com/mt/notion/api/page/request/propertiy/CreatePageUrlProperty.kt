package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreatePageUrlProperty(
    override val type: PropertyType = PropertyType.Url,
    val url: String? = null
) : WithCreatePageProperty
