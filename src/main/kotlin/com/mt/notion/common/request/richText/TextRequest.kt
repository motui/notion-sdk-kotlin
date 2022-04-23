package com.mt.notion.common.request.richText

import com.mt.notion.common.Link
import com.mt.notion.common.RichTextType

/**
 * Text objects contain the following information within the text property:
 *
 * @author it.motui
 */
data class TextRequest(
    override val annotations: AnnotationsRequest,
    override val type: RichTextType = RichTextType.Text,
    val link: Link?
) : RichTextRequest
