package com.mt.notion.api.database.request.sort

/**
 * Property
 * @author it.motui
 */
data class PropertySort(
    val property: String,
    val direction: Direction
) : Sort
