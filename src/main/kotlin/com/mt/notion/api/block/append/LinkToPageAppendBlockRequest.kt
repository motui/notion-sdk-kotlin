package com.mt.notion.api.block.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.parent.DatabaseParent
import com.mt.notion.common.parent.WithDatabaseParent
import com.mt.notion.common.parent.WorkspaceParent

/**
 *
 * @author it.motui
 */
data class LinkToPageAppendBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.LinkToPage,
    /**
     * support [WorkspaceParent] and [DatabaseParent]
     */
    @JsonProperty("link_to_page")
    val linkToPage: WithDatabaseParent
) : WithAppendBlockRequest {

}