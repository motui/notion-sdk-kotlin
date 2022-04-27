package com.mt.notion.api.block.request.update

import com.mt.notion.http.NotionHttpRequestContent

/**
 *
 * @author it.motui
 */
interface UpdateBlockRequest : NotionHttpRequestContent {
    val archived: Boolean?
}