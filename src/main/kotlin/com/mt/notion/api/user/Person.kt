package com.mt.notion.api.user

import com.mt.notion.common.ObjectType

/**
 * user
 *
 * @see <a href="https://developers.notion.com/reference/user">user</a>
 * @author it.motui
 */
data class Person(
    override val objectType: ObjectType,
    override val type: UserType,
    override val id: String,
    /**
     * User's name, as displayed in Notion.
     */
    override val name: String? = null,
    /**
     * Chosen avatar image.
     */
    override val avatarUrl: String? = null,
    val person: People? = null,
) : WithUserType(objectType, id, type, name, avatarUrl) {

    data class People(val email: String)
}