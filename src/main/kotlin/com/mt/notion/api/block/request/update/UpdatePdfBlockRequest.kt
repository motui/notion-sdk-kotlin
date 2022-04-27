package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class UpdatePdfBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Pdf,
    val pdf: com.mt.notion.api.block.request.update.UpdatePdfBlockRequest.Pdf
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {
    data class Pdf(
        val caption: List<RichTextRequest>? = null,
        val external: String? = null
    )
}