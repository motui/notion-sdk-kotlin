package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.parent.PageParentRequest
import com.mt.notion.common.request.parent.WithDatabaseParentRequest

/**
 *
 * @author it.motui
 */
data class LinkToPageBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.LinkToPage,
    override val objectType: ObjectType = ObjectType.Block,
    /**
     * support [DatabaseParentRequest]、[PageParentRequest]
     */
    @JsonProperty("link_to_page")
    val linkToPage: WithDatabaseParentRequest,
) : BlockObjectRequestWithoutChildren