package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class SyncedBlockAppendBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.SyncedBlock,
    @JsonProperty("synced_block")
    val syncedBlock: com.mt.notion.api.block.request.append.SyncedBlockAppendBlockRequest.SyncedBlock
) : com.mt.notion.api.block.request.append.WithAppendBlockRequest {
    data class SyncedBlock(
        @JsonProperty("synced_from")
        val syncedFrom: com.mt.notion.api.block.request.append.SyncedBlockAppendBlockRequest.SyncedFrom?,
    )

    data class SyncedFrom(
        @JsonProperty("block_id")
        val blockId: String,
        val type: String = "block_id",
    )
}