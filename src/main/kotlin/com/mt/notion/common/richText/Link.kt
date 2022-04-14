package com.mt.notion.common.richText

/**
 * Text objects contain the following information within the text property:
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class Link(val type: LinkType?, val url: String?)