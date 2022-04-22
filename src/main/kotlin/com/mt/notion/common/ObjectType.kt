package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * object type
 *
 * @author it.motui
 */
enum class ObjectType constructor(private val value: String) {
    @JsonProperty("user")
    User("user"),

    @JsonProperty("list")
    List("list"),

    @JsonProperty("database")
    Database("database"),

    @JsonProperty("page")
    Page("page"),
    ;

    override fun toString(): String = value
}
