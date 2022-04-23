package com.mt.notion.api.block.objects.file

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.file.FileType
import com.mt.notion.common.richText.RichText

/**
 * File object
 *
 * @author it.motui
 */
data class BlockFileDetails(
    override val type: FileType,
    override val caption: List<RichText>,
    var url: String,
    @JsonProperty("expiry_time")
    var expiryTime: String
) : BlockFile
