package com.mt.notion.api.block.objects.file

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.file.FileType

/**
 * File object
 *
 * @author it.motui
 */
data class BlockFileDetails(
    override val type: FileType,
    override val caption: List<com.mt.notion.common.response.richText.RichText>,
    var url: String,
    @JsonProperty("expiry_time")
    var expiryTime: String
) : BlockFile
