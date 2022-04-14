package com.mt.notion.common.file

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * File object
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/file-object">File object</a>
 */
enum class FileType constructor(private val value: String) {
    @JsonProperty("external")
    External("external"),

    @JsonProperty("file")
    File("file"),

    ;

    override fun toString(): String = value
}