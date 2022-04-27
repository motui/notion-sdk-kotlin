package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class SyncedBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.SyncedBlock,
    override val objectType: ObjectType = ObjectType.Block,
    @JsonProperty("synced_block")
    val syncedBlock: SyncedBlock,
) : BlockObjectRequestWithoutChildren {

    data class SyncedBlock(
        @JsonProperty("synced_from")
        val syncedFrom: SyncedFrom? = null
    )

    data class SyncedFrom(
        @JsonProperty("block_id")
        val blockId: String,
        val type: String? = "block_id"
    )
}