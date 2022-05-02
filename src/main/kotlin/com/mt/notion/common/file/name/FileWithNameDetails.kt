package com.mt.notion.common.file.name

import com.mt.notion.common.file.FileInfo
import com.mt.notion.common.file.FileType

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
