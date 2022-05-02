package com.mt.notion.common.request.select

import com.mt.notion.common.SelectColor

/**
 *
 * @author it.motui
 */
data class SelectIdPropertyRequest(
    val id: String,
    val name: String? = null,
    val color: SelectColor? = SelectColor.Default
) : WithSelectPropertyRequest
