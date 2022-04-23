package com.mt.notion.common.request.richText

import com.mt.notion.common.RichTextColor

/**
 * Annotations
 *
 * Style information which applies to the whole rich text object.
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class AnnotationsRequest(
    /**
     * Whether the text is bolded.
     */
    val bold: Boolean? = false,
    /**
     * Whether the text is italicized.
     */
    val italic: Boolean? = false,
    /**
     * Whether the text is struck through.
     */
    val strikethrough: Boolean? = false,
    /**
     * Whether the text is underlined.
     */
    val underline: Boolean? = false,
    /**
     * Whether the text is code style.
     */
    val code: Boolean? = false,
    /**
     * Color of the text.
     */
    val color: RichTextColor? = RichTextColor.Default
)
