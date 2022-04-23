package com.mt.notion.api.block

import com.fasterxml.jackson.annotation.JsonInclude
import com.mt.notion.common.request.PaginationRequest
import com.mt.notion.http.NotionHttpRequestContent

/**
 * List block children
 *
 * @author it.motui
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class BlocksRequest(
    override var startCursor: String?,
    override var pageSize: Int?
) : PaginationRequest,
    NotionHttpRequestContent
