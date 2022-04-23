package com.mt.notion.common.response.richText.mention

import com.mt.notion.common.RichTextType
import com.mt.notion.common.response.richText.Annotations
import com.mt.notion.common.response.richText.RichText

/**
 * Mention
 *
 * Mention objects represent an inline mention of a user, page, database, or date.
 * In the app these are created by typing @ followed by the name of a user, page, database, or a date.
 *
 * Mention objects contain a type key. In addition, mention objects contain a key corresponding with the value of type.
 * The value is an object containing type-specific configuration. The type-specific configurations are described in the
 * sections below.
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class Mention(
    override val plainText: String,
    override val href: String?,
    override val annotations: Annotations,
    override val type: RichTextType,
    val mention: WithMention
) : RichText
