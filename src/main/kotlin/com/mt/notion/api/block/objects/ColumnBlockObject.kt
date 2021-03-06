package com.mt.notion.api.block.objects

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.user.User
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class ColumnBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    val column: EmptyObject,
) : WithBlockObject