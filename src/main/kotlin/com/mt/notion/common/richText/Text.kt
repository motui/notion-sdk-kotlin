package com.mt.notion.common.richText

/**
 * Text objects contain the following information within the text property:
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class Text(
    override val plainText: String,
    override val href: String?,
    override val annotations: Annotations,
    override val type: RichTextType,
    /**
     * Text content. This field contains the actual content of your text and is probably the field you'll use most often.
     */
    val content: String,
    /**
     * Any inline link in this text.
     */
    val link: Link?
) : RichText