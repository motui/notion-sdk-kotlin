package com.mt.notion.common.request

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.http.NotionHttpRequestContent

/**
 * 分页参数
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/pagination">Pagination</a>
 */
interface PaginationRequest : NotionHttpRequestContent {
    @get:JsonProperty("start_cursor")
    var startCursor: String?

    @get:JsonProperty("page_size")
    var pageSize: Int?
}
