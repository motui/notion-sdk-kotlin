package com.mt.notion.common.request.richText.mention.user

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * User mentions
 *
 * User mentions contain a user object within the user property.
 *
 * @author it.motui
 */
data class BotUserMentionRequest(
    val id: String,
    val type: String? = "bot",
    val name: String? = null,
    @JsonProperty("avatar_url")
    val avatarUrl: String? = null,
    @JsonProperty("object")
    val objectType: String? = "user",
    val bot: Bot
) : WithUserMentionRequest {

    interface Bot

    class EmptyObject : Bot

    interface Owner : Bot

    data class User(
        val type: String = "user",
        val owner: WithOwner
    ) : Owner

    interface WithOwner

    data class OwnerPerson(
        val id: String,
        val person: PersonInfo,
        val name: String? = null,
        @JsonProperty("avatar_url")
        val avatarUrl: String? = null,
        val type: String = "person",
        @JsonProperty("object")
        val objectType: String = "user"
    ) : WithOwner

    data class OwnerUser(
        val id: String,
        @JsonProperty("object")
        val objectType: String = "user"
    ) : WithOwner


    data class Workspace(
        val type: String = "workspace",
        val workspace: Boolean = true
    ) : Owner
}
