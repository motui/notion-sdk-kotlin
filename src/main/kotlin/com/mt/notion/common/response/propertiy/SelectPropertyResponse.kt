package com.mt.notion.common.response.propertiy

import com.mt.notion.common.SelectColor

/**
 *
 * @author it.motui
 */
data class SelectPropertyResponse(
    val id: String,
    val name: String,
    val color: SelectColor
)
