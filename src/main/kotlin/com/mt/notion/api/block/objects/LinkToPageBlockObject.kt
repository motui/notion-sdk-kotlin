package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.ObjectType
import com.mt.notion.common.parent.PageParent
import com.mt.notion.common.parent.WithDatabaseParent

/**
 *
 * @author it.motui
 */
data class LinkToPageBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    /**
     * support [PageParent] and [DatabaseParent]
     */
    @JsonProperty("link_to_page")
    val linkToPage: WithDatabaseParent,
) : WithBlockObject