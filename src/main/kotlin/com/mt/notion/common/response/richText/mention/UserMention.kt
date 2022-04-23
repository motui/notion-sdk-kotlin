package com.mt.notion.common.response.richText.mention

import com.mt.notion.api.user.User

/**
 * User mentions
 *
 * User mentions contain a user object within the user property.
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class UserMention(
    override val type: MentionType,
    val user: User
) : WithMention
