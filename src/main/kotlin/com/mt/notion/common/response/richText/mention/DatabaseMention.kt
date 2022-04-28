package com.mt.notion.common.response.richText.mention

import com.mt.notion.common.Id

/**
 * Database mentions
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class DatabaseMention(
    override val type: MentionType,
    val database: Id
) : WithMention
