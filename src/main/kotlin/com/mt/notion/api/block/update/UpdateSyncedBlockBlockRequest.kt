package com.mt.notion.api.block.update

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
    val syncedBlock: SyncedBlock
) : UpdateBlockRequest {
    data class SyncedBlock(
        @JsonProperty("synced_from")
        val syncedFrom: SyncedFrom?,
    )

    data class SyncedFrom(
        @JsonProperty("block_id")
        val blockId: String,
        val type: String = "block_id",
    )
}