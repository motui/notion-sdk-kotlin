package com.mt.notion.common.response.file

/**
 * File object
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/file-object">File object</a>
 */
data class FileDetails(
    override val type: FileType,
    val file: FileInfo
) : File
