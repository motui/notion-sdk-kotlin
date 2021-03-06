package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreatePageEmailProperty(
    override val type: PropertyType = PropertyType.Email,
    val email: String? = null
) : WithCreatePageProperty
