package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor

/**
 *
 * @author it.motui
 */
data class UpdateTableOfContentsBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.TableOfContents,
    @JsonProperty("table_of_contents")
    val tableOfContents: TableOfContents
) : UpdateBlockRequest {
    data class TableOfContents(
        val color: ApiColor? = ApiColor.Default,
    )
}