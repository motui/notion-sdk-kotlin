package com.mt.notion.common.richText

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Link url
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
enum class LinkType constructor(private val value: String) {
    @JsonProperty("url")
    Url("url")
    ;

    override fun toString(): String = value
}
