package com.mt.notion.common.richText.mention

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
    val url: String
) : WithMention
