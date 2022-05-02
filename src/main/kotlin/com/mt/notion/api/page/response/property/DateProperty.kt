package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.DateResponse

/**
 *
 * @author it.motui
 */
data class DateProperty(
    override val type: PropertyType,
    override val id: String,
    val date: DateResponse
) : WithProperty
