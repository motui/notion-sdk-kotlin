package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.parent.DatabaseParentRequest
import com.mt.notion.common.request.parent.WithDatabaseParentRequest

/**
 *
 * @author it.motui
 */
data class AppendLinkToPageBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.LinkToPage,
    /**
     * support [WorkspaceParentRequest] and [DatabaseParentRequest]
     */
    @JsonProperty("link_to_page")
    val linkToPage: WithDatabaseParentRequest
) : WithAppendBlockRequest,
    BlockRequestWithChildren