package com.mt.notion.common.request.file

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class FileInfoRequest(
    val url: String,
    @JsonProperty("expiry_time")
    val expiryTime: String? = null
)