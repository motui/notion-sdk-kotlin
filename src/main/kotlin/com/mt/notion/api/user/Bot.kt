package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import com.mt.notion.common.ObjectType

/**
 * bot
 *
 * @author it.motui
 * @since 0.1
 */
data class Bot(
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
    /**
     * Properties only present for bot users.
     */
    val bot: InternalBot? = null

) : WithUserType {

    data class InternalBot constructor(
        /**
         * Information about who owns this bot.
         */
        val owner: Owner? = null
    )

    data class Owner constructor(
        /**
         * The type of owner - either "workspace" or "user".
         */
        val type: String,
        /**
         * Always true. Only present if owner.type is "workspace".
         */
        val workspace: Boolean,
        /**
         * A user object describing who owns this bot. Currently only "person" users can own bots. See the People
         * reference above for more detail. The properties in the user object are based on the bot capabilities.
         */
        val user: Person?
    )
}