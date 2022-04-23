package com.mt.notion.common.response.richText.mention

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Template Mention Date
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class TemplateMentionDateMention(
    override val type: TemplateMentionType,
    /**
     * optional value: "today" or "now"
     */
    @JsonProperty("template_mention_date")
    val templateMentionDate: String
) : TemplateMention
