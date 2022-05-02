package com.mt.notion.common.response.file

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Icon
 *
 * @author it.motui
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
    JsonSubTypes.Type(Emoji::class, name = "emoji"),
)
interface Icon {
    val type: FileType
}
