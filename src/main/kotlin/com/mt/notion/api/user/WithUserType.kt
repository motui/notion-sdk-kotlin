package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.WithObjectType

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
interface WithUserType : WithObjectType {
    /**
     * Type of the user. Possible values are "person" and "bot".
     */
    val type: UserType

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