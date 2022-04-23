package com.mt.notion.common.response.richText.mention

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.Link

/**
 * Link Preview mentions
 *
 * Link preview mentions contain the originally pasted url.
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class LinkPreviewMention(
    override val type: MentionType,
    @JsonProperty("link_preview")
    val linkPreview: Link
) : WithMention
