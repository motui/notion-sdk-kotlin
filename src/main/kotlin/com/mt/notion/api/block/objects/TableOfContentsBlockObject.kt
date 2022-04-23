package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.user.User
import com.mt.notion.common.ApiColor
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class TableOfContentsBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    @JsonProperty("table_of_contents")
    val tableOfContents: TableOfContents,
) : WithBlockObject {
    data class TableOfContents(
        val color: ApiColor
    )
}