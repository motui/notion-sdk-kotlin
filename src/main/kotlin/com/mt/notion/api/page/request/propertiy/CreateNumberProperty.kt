package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreateNumberProperty(
    override val type: PropertyType = PropertyType.Number,
    val number: Number? = null
) : WithCreateProperty
