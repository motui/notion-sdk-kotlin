package com.mt.notion.api.database.request.query.sort

/**
 * Timestamp
 *
 * @author it.motui
 */
enum class Timestamp constructor(private val value: String) {
    CreatedTime("created_time"),

    LastEditedTime("last_edited_time"),
    ;

    override fun toString(): String = value
}
