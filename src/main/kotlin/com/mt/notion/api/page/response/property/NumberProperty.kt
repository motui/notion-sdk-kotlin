package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class NumberProperty(
    override val type: PropertyType,
    override val id: String,
    val number: Number?
) : WithProperty
