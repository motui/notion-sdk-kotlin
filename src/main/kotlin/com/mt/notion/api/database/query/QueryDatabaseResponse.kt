package com.mt.notion.api.database.query

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.query.property.QueryDatabaseProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.Cover
import com.mt.notion.common.Icon
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.parent.WithDatabaseParentRequest

/**
 *
 * @author it.motui
 */
data class QueryDatabaseResponse(
    override val objectType: ObjectType,
    override val id: String,
    val parent: WithDatabaseParentRequest,
    val properties: Map<String, QueryDatabaseProperty>,
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