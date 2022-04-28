package com.mt.notion.api.block.request.append.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.block.request.append.BlockRequestWithChildren
import com.mt.notion.api.block.request.children.BlockObjectRequestWithoutChildren
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class SyncedBlockBlockRequestWithChildren(
    val objectType: ObjectType = ObjectType.Block,
    val type: BlockObjectType? = BlockObjectType.Callout,
    @JsonProperty("synced_block")
    val synced_block: SyncedBlock
) : BlockRequestWithChildren {

    data class SyncedBlock(
        @JsonProperty("synced_from")
        val syncedFrom: SyncedFrom? = null,
        val children: List<BlockObjectRequestWithoutChildren>?
    )

    data class SyncedFrom(
        @JsonProperty("block_id")
        val blockId: String,
        val type: String = "block_id",
    )
}