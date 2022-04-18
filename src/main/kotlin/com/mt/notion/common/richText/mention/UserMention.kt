package com.mt.notion.common.richText.mention

import com.mt.notion.api.user.BaseUser

/**
 * User mentions
 *
 * User mentions contain a user object within the user property.
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class UserMention(
    override val type: MentionType,
    val user: BaseUser
) : WithMention