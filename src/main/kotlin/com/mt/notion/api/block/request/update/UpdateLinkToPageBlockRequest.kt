package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.request.parent.DatabaseParentRequest
import com.mt.notion.common.request.parent.WithParentRequest

/**
 *
 * @author it.motui
 */
data class UpdateLinkToPageBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.LinkToPage,
    /**
     * support [WorkspaceParentRequest] and [DatabaseParentRequest]
     */
    @JsonProperty("link_to_page")
    val linkToPage: WithParentRequest
) : UpdateBlockRequest