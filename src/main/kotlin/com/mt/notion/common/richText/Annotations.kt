package com.mt.notion.common.richText

/**
 * Annotations
 *
 * Style information which applies to the whole rich text object.
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class Annotations(
    /**
     * Whether the text is bolded.
     */
    val bold: Boolean,
    /**
     * Whether the text is italicized.
     */
    val italic: Boolean,
    /**
     * Whether the text is struck through.
     */
    val strikethrough: Boolean,
    /**
     * Whether the text is underlined.
     */
    val underline: Boolean,
    /**
     * Whether the text is code style.
     */
    val code: Boolean,
    /**
     * Color of the text.
     */
    val color: RichTextColor,

)
