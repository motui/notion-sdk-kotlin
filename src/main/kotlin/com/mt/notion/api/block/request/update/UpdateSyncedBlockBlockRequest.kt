package com.mt.notion.api.block.request.update

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateSyncedBlockBlockRequest(
    override val archived: Boolean? = false,
    val type: BlockObjectType? = BlockObjectType.SyncedBlock,
    @JsonProperty("synced_block")
    val syncedBlock: com.mt.notion.api.block.request.update.UpdateSyncedBlockBlockRequest.SyncedBlock
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {
    data class SyncedBlock(
        @JsonProperty("synced_from")
        val syncedFrom: com.mt.notion.api.block.request.update.UpdateSyncedBlockBlockRequest.SyncedFrom?,
    )

    data class SyncedFrom(
        @JsonProperty("block_id")
        val blockId: String,
        val type: String = "block_id",
    )
}