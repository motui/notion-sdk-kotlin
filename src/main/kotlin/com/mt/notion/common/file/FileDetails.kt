package com.mt.notion.common.file

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * File object
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/file-object">File object</a>
 */
data class FileDetails(
    override val type: FileType,
    /**
     * Authenticated S3 URL to the file. The file URL will be valid for 1 hour but updated links can be requested
     * if required.
     */
    var url: String,
    /**
     * Date and time when this will expire. Formatted as an ISO 8601 date time string.
     */
    @JsonProperty("expiry_time")
    var expiryTime: String
) : File
