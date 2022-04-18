package com.mt.notion.common.richText.mention

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * template mention
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
enum class TemplateMentionType constructor(private val value: String) {
    @JsonProperty("template_mention_date")
    TemplateMentionDate("template_mention_date"),

    @JsonProperty("template_mention_user")
    TemplateMentionUser("template_mention_user"),
    ;

    override fun toString(): String = value
}