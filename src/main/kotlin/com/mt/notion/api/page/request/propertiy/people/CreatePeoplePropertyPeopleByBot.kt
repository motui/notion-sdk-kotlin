package com.mt.notion.api.page.request.propertiy.people

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.UserType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.PersonRequest

/**
 *
 * @author it.motui
 */
data class CreatePeoplePropertyPeopleByBot(
    val id: String,
    val bot: WithBot,
    val name: String? = null,
    @JsonProperty("avatar_url")
    val avatarUrl: String? = null,
    val type: UserType = UserType.BOT,
    @JsonProperty("object")
    val objectType: ObjectType = ObjectType.User,
) : WithCreatePeoplePropertyPeople {

    interface WithBot

    class EmptyObject : WithBot

    data class Owner(
        val owner: WithOwner
    ) : WithBot

    interface WithOwner

    data class Workspace(
        val type: String = "workspace",
        val workspace: Boolean = true
    ) : WithOwner

    data class User(
        val user: WithOwnerUser
    ) : WithOwner

    interface WithOwnerUser

    data class OwnerUser(
        val id: String,
        val person: PersonRequest,
        val name: String? = null,
        @JsonProperty("avatar_url")
        val avatarUrl: String? = null,
        val type: UserType = UserType.PERSON,
        @JsonProperty("object")
        val objectType: ObjectType = ObjectType.User,
    ) : WithOwnerUser

    data class OwnerId(
        val id: String,
        @JsonProperty("object")
        val objectType: ObjectType = ObjectType.User,
    ) : WithOwnerUser
}