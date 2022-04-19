package com.mt.notion.common.richText.mention

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * MentionType
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
enum class MentionType constructor(private val value: String) {
    @JsonProperty("user")
    User("user"),

    @JsonProperty("page")
    Page("page"),

    @JsonProperty("database")
    Database("database"),

    @JsonProperty("date")
    Date("date"),

    @JsonProperty("link_preview")
    LinkPreview("link_preview");

    override fun toString(): String = value
}
