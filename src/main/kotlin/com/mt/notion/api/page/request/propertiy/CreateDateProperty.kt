package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.DateRequest

/**
 *
 * @author it.motui
 */
data class CreateDateProperty(
    override val type: PropertyType = PropertyType.Date,
    val date: DateRequest
) : WithCreateProperty
