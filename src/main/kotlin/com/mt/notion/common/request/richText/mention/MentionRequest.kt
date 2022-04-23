package com.mt.notion.common.request.richText.mention

import com.mt.notion.common.RichTextType
import com.mt.notion.common.request.richText.AnnotationsRequest
import com.mt.notion.common.request.richText.RichTextRequest

/**
 * Mention request
 *
 * @author it.motui
 */
data class MentionRequest(
    override val annotations: AnnotationsRequest?,
    override val type: RichTextType? = RichTextType.Mention,
    val mention: WithMentionRequest
) : RichTextRequest
