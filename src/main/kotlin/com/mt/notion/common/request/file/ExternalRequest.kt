package com.mt.notion.common.request.file

import com.mt.notion.common.Link
import com.mt.notion.common.file.FileType

/**
 *
 * @author it.motui
 */
data class ExternalRequest(
    override val type: FileType = FileType.External,
    val external: Link
) : IconRequest