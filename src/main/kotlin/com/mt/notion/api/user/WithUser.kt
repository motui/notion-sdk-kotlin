package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(Person::class, name = "person"),
    JsonSubTypes.Type(Bot::class, name = "bot")
)
open class WithUser(
    override val objectType: ObjectType,
    override val id: String,
    /**
     * Type of the user. Possible values are "person" and "bot".
     */
    open val type: UserType,

    /**
     * User's name, as displayed in Notion.
     */
    open val name: String?,

    /**
     * Chosen avatar image.
     */
    @get:JsonProperty("avatar_url")
    open val avatarUrl: String?

) : User(objectType, id) {
    fun toPerson(): Person {
        if (this.type == UserType.PERSON) {
            return this as Person
        }
        throw RuntimeException("当前类型不是person")
    }

    fun toBot(): Bot {
        if (this.type == UserType.BOT) {
            return this as Bot
        }
        throw RuntimeException("当前类型不是bot")
    }
}
