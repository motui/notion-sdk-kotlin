package com.mt.notion.api.database.request.query.sort

/**
 * timestamp
 *
 * @author it.motui
 */
data class TimestampSort(
    val timestamp: Timestamp,
    val direction: Direction
) : Sort
