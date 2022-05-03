package com.mt.notion.api.page.response.property.objects

import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class NumberObjectProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    val number: Number?
) : WithObjectProperty
