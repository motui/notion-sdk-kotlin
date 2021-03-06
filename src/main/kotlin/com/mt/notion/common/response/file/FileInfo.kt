package com.mt.notion.common.response.file

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class FileInfo(
    val url: String,
    @JsonProperty("expiry_time")
    val expiryTime: String
)