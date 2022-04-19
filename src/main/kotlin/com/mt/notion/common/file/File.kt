package com.mt.notion.common.file

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.Cover
import com.mt.notion.common.Icon

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

    companion object {

        /**
         * ExternalFileDetails
         */
        fun external(url: String): ExternalFileDetails {
            return ExternalFileDetails(type = FileType.External, url = url)
        }

        /**
         * FileDetails
         */
        fun file(url: String, expiryTime: String): FileDetails {
            return FileDetails(type = FileType.File, url = url, expiryTime = expiryTime)
        }
    }
}
