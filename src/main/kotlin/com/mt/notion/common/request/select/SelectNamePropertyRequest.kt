package com.mt.notion.common.request.select

import com.mt.notion.common.SelectColor

/**
 *
 * @author it.motui
 */
data class SelectNamePropertyRequest(
    val id: String? = null,
    val name: String,
    val color: SelectColor? = SelectColor.Default
) : WithSelectPropertyRequest
