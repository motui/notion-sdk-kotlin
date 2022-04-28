package com.mt.notion.common.request.richText.mention.user

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * User mentions
 *
 * User mentions contain a user object within the user property.
 *
 * @author it.motui
 */
data class PersonUserMentionRequest(
    val id: String,
    val type: String? = "person",
    val name: String? = null,
    @JsonProperty("avatar_url")
    val avatarUrl: String? = null,
    @JsonProperty("object")
    val objectType: String? = "user",
    val person: PersonInfo
) : WithUserMentionRequest
