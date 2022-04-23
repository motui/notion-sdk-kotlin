package com.mt.notion.common.response.richText.mention

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Template Mention Date
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class TemplateMentionUserMention(
    override val type: TemplateMentionType,
    /**
     * optional value: "me"
     */
    @JsonProperty("template_mention_user")
    val templateMentionUser: String
) : TemplateMention
