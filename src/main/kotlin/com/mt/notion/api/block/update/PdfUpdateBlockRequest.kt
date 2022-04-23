package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class PdfUpdateBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.Pdf,
    val pdf: Pdf
) : UpdateBlockRequest {
    data class Pdf(
        val caption: List<RichTextRequest>? = null,
        val external: String? = null
    )
}