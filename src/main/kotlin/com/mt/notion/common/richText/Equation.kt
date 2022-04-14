package com.mt.notion.common.richText

/**
 * Equation
 *
 * Equation objects contain the following information within the equation property:
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class Equation(
    override val plainText: String,
    override val href: String?,
    override val annotations: Annotations,
    override val type: RichTextType,
    /**
     * The LaTeX string representing this inline equation.
     */
    val expression: String
) : RichText