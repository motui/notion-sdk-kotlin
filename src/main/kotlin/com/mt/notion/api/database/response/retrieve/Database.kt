package com.mt.notion.api.database.response.retrieve

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.response.retrieve.property.WithDatabaseProperty
import com.mt.notion.api.search.WithSearch
import com.mt.notion.api.user.User
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.parent.WithParentRequest
import com.mt.notion.common.response.WithObjectType
import com.mt.notion.common.response.file.Cover
import com.mt.notion.common.response.file.Icon
import com.mt.notion.common.response.richText.RichText

/**
 * database
 *
 * @author it.motui
 */
data class Database(
    override val objectType: ObjectType,
    val id: String,
    /**
     * Date and time when this database was created. Formatted as an ISO 8601 date time string.
     *
     * eg:"2020-03-17T19:10:04.968Z"
     */
    @JsonProperty("created_time")
    val createdTime: String,
    /**
     * User who created the database.
     */
    @JsonProperty("created_by")
    val createdBy: User,
    /**
     * Date and time when this database was updated. Formatted as an ISO 8601 date time string.
     *
     * eg:"2020-03-17T21:49:37.913Z"
     */
    @JsonProperty("last_edited_time")
    val lastEditedTime: String,
    /**
     * User who last edited the database.
     */
    @JsonProperty("last_edited_by")
    val lastEditedBy: User,

    /**
     * Name of the database as it appears in Notion.
     * See rich text object) for a breakdown of the properties.
     */
    val title: List<RichText>,

    /**
     * Page icon.
     *
     * File Object or Emoji object
     */
    val icon: Icon?,

    /**
     * Page cover image.
     *
     * File object (only type of "external" is supported currently)
     */
    val cover: Cover?,

    /**
     * Schema of properties for the database as they appear in Notion.
     */
    val properties: Map<String, WithDatabaseProperty>,

    /**
     * The parent of this page. Can be a page or workspace. Parent types are defined below.
     */
    val parent: WithParentRequest,

    /**
     * The URL of the Notion database.
     */
    val url: String,

    /**
     * The archived status of the database.
     */
    val archived: Boolean

) : WithObjectType, WithSearch
