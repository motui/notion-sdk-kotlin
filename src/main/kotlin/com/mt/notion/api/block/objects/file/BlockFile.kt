package com.mt.notion.api.block.objects.file

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.response.file.FileType

/**
 * File
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
    JsonSubTypes.Type(BlockExternalFileDetails::class, name = "external"),
    JsonSubTypes.Type(BlockFileDetails::class, name = "file"),
)
interface BlockFile {
    val type: FileType
    val caption: List<com.mt.notion.common.response.richText.RichText>
}
