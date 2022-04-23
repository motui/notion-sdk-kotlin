package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class FileUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.File,
    val file: File
) : UpdateBlockRequest {
    data class File(
        val caption: List<RichTextRequest>?,
        val external: String?
    )
}