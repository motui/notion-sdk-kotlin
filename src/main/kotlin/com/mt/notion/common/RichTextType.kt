package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * RichTextType
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
enum class RichTextType constructor(private val value: String) {
    @JsonProperty("text")
    Text("text"),

    @JsonProperty("mention")
    Mention("mention"),

    @JsonProperty("equation")
    Equation("equation"),
    ;

    override fun toString(): String = value
}
