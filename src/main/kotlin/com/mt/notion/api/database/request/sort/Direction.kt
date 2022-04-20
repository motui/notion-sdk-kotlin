package com.mt.notion.api.database.request.sort

/**
 * Direction
 *
 * @author it.motui
 */
enum class Direction constructor(private val value: String) {
    Ascending("ascending"),

    Descending("descending"),
    ;

    override fun toString(): String = value
}
