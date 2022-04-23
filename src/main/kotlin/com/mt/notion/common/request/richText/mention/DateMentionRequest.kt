package com.mt.notion.common.request.richText.mention

import com.mt.notion.common.request.DateRequest

/**
 * Date mentions
 *
 * @author it.motui
 */
data class DateMentionRequest(
    val date: DateRequest? = null,
) : WithMentionRequest
