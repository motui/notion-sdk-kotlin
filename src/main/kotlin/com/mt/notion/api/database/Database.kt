package com.mt.notion.api.database

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.WithUserType
import com.mt.notion.common.ObjectType
import com.mt.notion.common.WithObjectType
import com.mt.notion.common.richText.RichText

/**
 * database
 *
 * @author it.motui
 * @since 0.1
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
    val user: WithUserType,
    /**
     * Date and time when this database was updated. Formatted as an ISO 8601 date time string.
     *
     * eg:"2020-03-17T21:49:37.913Z"
     */
    @JsonProperty("last_edited_time")
    val lastEditedTime: String,
    /**
     * User who last edited the database.
     *
     */
    @JsonProperty("last_edited_by")
    val lastEditedBy: WithUserType,

    /**
     * Name of the database as it appears in Notion.
     * See rich text object) for a breakdown of the properties.
     */
    val title: List<RichText>

) : WithObjectType