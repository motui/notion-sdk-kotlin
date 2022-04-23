package com.mt.notion.common.request.richText

import com.mt.notion.common.Expression
import com.mt.notion.common.RichTextType

/**
 * Equation
 *
 * Equation objects contain the following information within the equation property:
 *
 * @author it.motui
 */
data class EquationRequest(
    override val annotations: AnnotationsRequest,
    override val type: RichTextType = RichTextType.Equation,
    val equation: Expression
) : RichTextRequest {
}
