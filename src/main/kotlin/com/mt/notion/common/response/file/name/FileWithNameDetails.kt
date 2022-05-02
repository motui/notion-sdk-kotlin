package com.mt.notion.common.response.file.name

import com.mt.notion.common.response.file.FileInfo
import com.mt.notion.common.response.file.FileType

/**
 * File object
 *
 * @author it.motui
 */
data class FileWithNameDetails(
    override val type: FileType,
    override val name: String,
    val file: FileInfo
) : WithNameFile
