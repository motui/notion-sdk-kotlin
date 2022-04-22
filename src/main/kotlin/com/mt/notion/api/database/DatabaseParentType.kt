package com.mt.notion.api.database

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Database Parent Type
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
enum class DatabaseParentType constructor(private val value: String) {
    @JsonProperty("page_id")
    PageId("page_id"),

    @JsonProperty("workspace")
    Workspace("workspace"),

    @JsonProperty("database_id")
    DatabaseId("database_id"),
    ;

    override fun toString(): String = value
}
