package com.mt.notion.common.response.richText

import com.mt.notion.common.RichTextType

/**
 * Equation
 *
 * Equation objects contain the following information within the equation property:
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class Equation(
    override val plainText: String,
    override val href: String?,
    override val annotations: com.mt.notion.common.response.richText.Annotations,
    override val type: RichTextType,
    /**
     * The LaTeX string representing this inline equation.
     */
    val expression: String
) : com.mt.notion.common.response.richText.RichText
