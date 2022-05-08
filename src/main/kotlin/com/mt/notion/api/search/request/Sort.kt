package com.mt.notion.api.search.request

import com.mt.notion.common.request.Direction

/**
 *
 * @author it.motui
 */
data class Sort(
    val timestamp: String = "last_edited_time",
    val direction: Direction
)
