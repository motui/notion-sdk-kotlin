package com.mt.notion.api.search.request

/**
 *
 * @author it.motui
 */
data class Filter(
    val property: String = "object",
    val value: ValueType
) {
    enum class ValueType(private val value: String) {
        Page("page"),

        Database("database"),
        ;

        override fun toString(): String = value
    }
}
