package com.mt.notion.api.page.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.page.response.property.WithProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.Cover
import com.mt.notion.common.Icon
import com.mt.notion.common.ObjectType
import com.mt.notion.common.parent.WithParent

/**
 *
 * @author it.motui
 */
data class Page(
    override val objectType: ObjectType,
    val id: String,
    val parent: WithParent,
    val properties: Map<String, WithProperty>,
    @JsonProperty("created_by")
    val createdBy: User,
    @JsonProperty("last_edited_by")
    val lastEditedBy: User,
    @JsonProperty("created_time")
    val createdTime: String,
    @JsonProperty("last_edited_time")
    val lastEditedTime: String,
    val icon: Icon?,
    val cover: Cover?,
    val url: String,
    val archived: Boolean
) : WithPage
