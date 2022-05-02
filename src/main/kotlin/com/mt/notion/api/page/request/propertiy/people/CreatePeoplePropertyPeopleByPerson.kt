package com.mt.notion.api.page.request.propertiy.people

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.UserType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.PersonRequest

/**
 *
 * @author it.motui
 */
data class CreatePeoplePropertyPeopleByPerson(
    val id: String,
    val person: PersonRequest,
    val name: String? = null,
    @JsonProperty("avatar_url")
    val avatarUrl: String? = null,
    val type: UserType = UserType.PERSON,
    @JsonProperty("object")
    val objectType: ObjectType = ObjectType.User,
) : WithCreatePeoplePropertyPeople