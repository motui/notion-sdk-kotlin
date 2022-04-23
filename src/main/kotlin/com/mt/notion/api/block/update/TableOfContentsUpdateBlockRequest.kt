package com.mt.notion.api.block.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor

/**
 *
 * @author it.motui
 */
data class TableOfContentsUpdateBlockRequest(
    override val archived: Boolean?,
    val type: BlockObjectType? = BlockObjectType.TableOfContents,
    @JsonProperty("table_of_contents")
    val tableOfContents: TableOfContents
) : UpdateBlockRequest {
    data class TableOfContents(
        val color: ApiColor?,
    )
}