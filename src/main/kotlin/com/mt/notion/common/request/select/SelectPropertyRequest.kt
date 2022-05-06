package com.mt.notion.common.request.select

import com.mt.notion.common.SelectColor

/**
 *
 * @author it.motui
 */
data class SelectPropertyRequest(
    val name: String,
    val color: SelectColor? = SelectColor.Default
)
