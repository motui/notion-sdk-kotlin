package com.mt.notion.common.richText.mention

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Date mentions
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class DateMention(
    override val type: MentionType,
    val start: String,
    val end: String?,
    @JsonProperty("time_zone")
    val timeZone: String?,
) : WithMention
