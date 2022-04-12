package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import com.mt.notion.common.ObjectType

/**
 * user
 *
 * @see <a href="https://developers.notion.com/reference/user">user</a>
 * @author it.motui
 */
//@JsonTypeName(value = "person")
data class Person(
    override val objectType: ObjectType,
    override val type: UserType,
    val id: String,
    /**
     * User's name, as displayed in Notion.
     */
    val name: String? = null,
    /**
     * Chosen avatar image.
     */
    @JsonProperty("avatar_url")
    val avatarUrl: String? = null,
    val person: People? = null,
) : WithUserType {

    data class People(val email: String)
}