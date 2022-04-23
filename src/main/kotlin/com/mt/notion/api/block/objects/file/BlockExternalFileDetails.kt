package com.mt.notion.api.block.objects.file

import com.mt.notion.common.file.FileType
import com.mt.notion.common.richText.RichText

/**
 * External file object
 *
 * @author it.motui
 */
data class BlockExternalFileDetails(
    override val type: FileType,
    override val caption: List<RichText>,
    var url: String? = null
) : BlockFile
