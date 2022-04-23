package com.mt.notion.common.request.richText.mention.user

/**
 * User mentions
 *
 * User mentions contain a user object within the user property.
 *
 * @author it.motui
 */
data class IdUserMentionRequest(
    val id: String
) : WithUserMentionRequest
