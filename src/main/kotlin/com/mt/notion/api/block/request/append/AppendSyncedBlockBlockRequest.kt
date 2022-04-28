package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendSyncedBlockBlockRequest(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.SyncedBlock,
    @JsonProperty("synced_block")
    val syncedBlock: SyncedBlock
) : WithAppendBlockRequest {
    data class SyncedBlock(
        @JsonProperty("synced_from")
        val syncedFrom: SyncedFrom?,
    )

    data class SyncedFrom(
        @JsonProperty("block_id")
        val blockId: String,
        val type: String = "block_id",
        // TODO: 2022/4/28 待补充
        val children: BlockRequestWithoutChildren
    )
}