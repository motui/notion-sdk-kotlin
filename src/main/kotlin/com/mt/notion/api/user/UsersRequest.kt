package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonInclude
import com.mt.notion.common.PaginationRequest
import com.mt.notion.http.NotionHttpRequestContent

/**
 * List all users
 *
 * @author it.motui
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class UsersRequest(override var startCursor: String?, override var pageSize: Int?) :
    PaginationRequest,
    NotionHttpRequestContent
