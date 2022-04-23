package com.mt.notion.common.request.richText.mention

import com.mt.notion.common.Id

/**
 * Database mentions
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class DatabaseMentionRequest(
    val database: Id
) : WithMentionRequest {
}
