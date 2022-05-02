package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.select.WithSelectPropertyRequest

/**
 *
 * @author it.motui
 */
data class CreateSelectProperty(
    override val type: PropertyType = PropertyType.Select,
    val select: WithSelectPropertyRequest? = null
) : WithCreateProperty
