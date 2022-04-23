package com.mt.notion.api.database

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.property.DatabaseProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.Cover
import com.mt.notion.common.Icon
import com.mt.notion.common.ObjectType
import com.mt.notion.common.WithObjectType
import com.mt.notion.common.parent.WithDatabaseParent

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
    val title: List<com.mt.notion.common.response.richText.RichText>,

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
    val properties: Map<String, DatabaseProperty>,

    /**
     * The parent of this page. Can be a page or workspace. Parent types are defined below.
     */
    val parent: WithDatabaseParent,

    /**
     * The URL of the Notion database.
     */
    val url: String,

    /**
     * The archived status of the database.
     */
    val archived: Boolean

) : WithObjectType
