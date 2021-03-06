package com.mt.notion.common.request.file.name

import com.mt.notion.common.response.file.FileType

/**
 * File
 *
 * @author it.motui
 */
interface WithNameFileRequest {
    val type: FileType
    val name: String
}
