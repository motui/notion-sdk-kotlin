package com.mt.notion.common.response.file

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * File object
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/file-object">File object</a>
 */
enum class FileType constructor(private val value: String) {
    @JsonProperty("external")
    External("external"),

    @JsonProperty("file")
    File("file"),

    @JsonProperty("emoji")
    Emoji("emoji"),

    ;

    override fun toString(): String = value
}
