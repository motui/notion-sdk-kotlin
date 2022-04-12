package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * user type
 *
 * @author it.motui
 * @since 0.1
 */
enum class UserType constructor(private val value: String) {
    @JsonProperty("person")
    PERSON("person"),

    @JsonProperty("bot")
    BOT("bot"),
    ;

    override fun toString(): String = value
}