package com.mt.notion.api.database

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Parent Type
 *
 * @author it.motui
 */
enum class ParentType constructor(private val value: String) {
    @JsonProperty("page_id")
    PageId("page_id"),

    @JsonProperty("workspace")
    Workspace("workspace"),

    @JsonProperty("database_id")
    DatabaseId("database_id"),
    ;

    override fun toString(): String = value
}
