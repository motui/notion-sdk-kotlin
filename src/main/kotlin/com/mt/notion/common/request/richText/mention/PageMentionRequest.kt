package com.mt.notion.common.request.richText.mention

import com.mt.notion.common.Id

/**
 * Page mentions
 *
 * @author it.motui
 */
data class PageMentionRequest(
    val page: Id
) : WithMentionRequest
