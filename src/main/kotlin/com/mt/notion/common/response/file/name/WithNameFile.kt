package com.mt.notion.common.response.file.name

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.response.file.FileType

/**
 * File
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/file-object">File object</a>
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(ExternalWithNameFileDetails::class, name = "external"),
    JsonSubTypes.Type(FileWithNameDetails::class, name = "file"),
)
interface WithNameFile {
    val type: FileType
    val name: String
}
