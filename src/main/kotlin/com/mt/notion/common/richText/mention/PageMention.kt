package com.mt.notion.common.richText.mention

/**
 * Page mentions
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class PageMention(
    override val type: MentionType,
    val page: Page
) : WithMention {

    data class Page(
        val id: String
    )
}