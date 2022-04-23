package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class SyncedBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    @JsonProperty("synced_block")
    val syncedBlock: SyncedBlock,
) : WithBlockObject {

    data class SyncedBlock(
        @JsonProperty("synced_from")
        val syncedFrom: SyncedFrom
    )

    data class SyncedFrom(
        @JsonProperty("block_id")
        val blockId: String
    )

}