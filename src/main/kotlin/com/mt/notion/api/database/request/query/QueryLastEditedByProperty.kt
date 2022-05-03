package com.mt.notion.api.database.request.query

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.PropertyType

/**
 * lastEditedBy
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class QueryLastEditedByProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("last_edited_by")
    val lastEditedBy: User
) : QueryDatabaseProperty
