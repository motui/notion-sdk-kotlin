package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * object type
 *
 * @author it.motui
 * @since 0.1
 */
enum class ObjectType constructor(private val value: String) {
    @JsonProperty("user")
    USER("user"),

    @JsonProperty("list")
    LIST("list"),
    ;

    override fun toString(): String = value
}