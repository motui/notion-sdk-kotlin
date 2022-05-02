package com.mt.notion.common.request.file.name

import com.mt.notion.common.request.file.FileInfoRequest
import com.mt.notion.common.response.file.FileType

/**
 * File object
 *
 * @author it.motui
 */
data class FileWithNameFileRequest(
    override val type: FileType,
    override val name: String,
    val file: FileInfoRequest
) : WithNameFileRequest
