package com.mt.notion.common.response.file

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

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
    JsonSubTypes.Type(ExternalFileDetails::class, name = "external"),
    JsonSubTypes.Type(FileDetails::class, name = "file"),
)
interface File : Icon, Cover {
    override val type: FileType
}
