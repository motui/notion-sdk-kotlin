package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreateCheckboxProperty(
    override val type: PropertyType = PropertyType.Checkbox,
    val checkbox: Boolean
) : WithCreateProperty
