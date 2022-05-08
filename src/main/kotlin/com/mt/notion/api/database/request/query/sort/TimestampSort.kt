package com.mt.notion.api.database.request.query.sort

import com.mt.notion.common.request.Direction

/**
 * timestamp
 *
 * @author it.motui
 */
data class TimestampSort(
    val timestamp: Timestamp,
    val direction: Direction
) : Sort
