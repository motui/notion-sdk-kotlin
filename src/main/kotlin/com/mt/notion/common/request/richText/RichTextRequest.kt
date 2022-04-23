package com.mt.notion.common.request.richText

import com.mt.notion.common.RichTextType

/**
 * Rich text
 *
 * @author it.motui
 */
interface RichTextRequest {
    val annotations: AnnotationsRequest?
    val type: RichTextType?
}
