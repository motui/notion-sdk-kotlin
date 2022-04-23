package com.mt.notion.common.request.richText.mention.user

import com.mt.notion.common.request.richText.mention.WithMentionRequest

/**
 * User mentions
 *
 * User mentions contain a user object within the user property.
 *
 * @author it.motui
 */
data class UserMentionRequest(
    val user: WithUserMentionRequest
) : WithMentionRequest
