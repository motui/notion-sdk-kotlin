package com.mt.notion.api.database.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.query.WithQueryDatabaseProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.parent.WithParentRequest
import com.mt.notion.common.response.file.Cover
import com.mt.notion.common.response.file.Icon

/**
 *
 * @author it.motui
 */
data class QueryDatabaseResponse(
    override val objectType: ObjectType,
    override val id: String,
    val parent: WithParentRequest,
    val properties: Map<String, WithQueryDatabaseProperty>,
    val icon: Icon?,
    val cover: Cover?,
    @JsonProperty("created_time")
    val createdTime: String,
    @JsonProperty("created_by")
    val createdBy: User,
    @JsonProperty("last_edited_time")
    val lastEditedTime: String,
    @JsonProperty("last_edited_by")
    val lastEditedBy: User,
    val url: String,
    val archived: Boolean

) : ShortQueryDatabaseResponse(objectType, id)