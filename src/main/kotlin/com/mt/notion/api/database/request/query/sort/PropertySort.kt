package com.mt.notion.api.database.request.query.sort

import com.mt.notion.common.request.Direction

/**
 * Property
 * @author it.motui
 */
data class PropertySort(
    val property: String,
    val direction: Direction
) : Sort
