package com.mt.notion.api.block.objects.file

import com.mt.notion.common.file.FileType

/**
 * External file object
 *
 * @author it.motui
 */
data class BlockExternalFileDetails(
    override val type: FileType,
    override val caption: List<com.mt.notion.common.response.richText.RichText>,
    var url: String? = null
) : BlockFile
