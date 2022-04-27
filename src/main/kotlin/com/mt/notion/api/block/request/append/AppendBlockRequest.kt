package com.mt.notion.api.block.request.append

import com.mt.notion.http.NotionHttpRequestContent

/**
 *
 * @author it.motui
 */
data class AppendBlockRequest(
    val children: List<com.mt.notion.api.block.request.append.WithAppendBlockRequest>
) : NotionHttpRequestContent {

}