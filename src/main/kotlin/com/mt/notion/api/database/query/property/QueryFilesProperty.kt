package com.mt.notion.api.database.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.PropertyType

/**
 * Files
 *
 * @author it.motui
 */
data class QueryFilesProperty(
    override val id: String,
    override val type: PropertyType,
    val files: List<WithFile>?
) : QueryDatabaseProperty {

    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
    )
    @JsonSubTypes(
        JsonSubTypes.Type(File::class, name = "file"),
        JsonSubTypes.Type(External::class, name = "external"),
    )
    interface WithFile {
        val name: String
        val type: String?
    }

    data class File(
        override val name: String,
        override val type: String?,
        val file: FileData
    ) : WithFile

    data class External(
        override val name: String,
        override val type: String?,
        val file: ExternalData
    ) : WithFile

    data class FileData(
        val url: String,
        @JsonProperty("expiry_time")
        val expiryTime: String
    )

    data class ExternalData(
        val url: String,
    )
}
