package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 响应分页参数
 *
 * @author it.motui
 * @since 0.1
 */
interface PaginationResponse {
    @get:JsonProperty("next_cursor")
    val nextCursor: String?

    @get:JsonProperty("has_more")
    val hasMore: Boolean?
}