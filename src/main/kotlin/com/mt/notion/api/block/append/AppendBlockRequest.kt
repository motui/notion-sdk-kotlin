package com.mt.notion.api.block.append

import com.mt.notion.http.NotionHttpRequestContent

/**
 *
 * @author it.motui
 */
data class AppendBlockRequest(
    val children: List<WithAppendBlockRequest>
) : NotionHttpRequestContent {

}