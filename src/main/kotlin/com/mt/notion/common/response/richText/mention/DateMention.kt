package com.mt.notion.common.response.richText.mention

import com.mt.notion.common.response.DateResponse

/**
 * Date mentions
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class DateMention(
    override val type: MentionType,
    val date: DateResponse
) : WithMention
