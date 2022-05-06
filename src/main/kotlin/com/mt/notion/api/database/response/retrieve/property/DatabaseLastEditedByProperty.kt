package com.mt.notion.api.database.response.retrieve.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * lastEditedBy
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseLastEditedByProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("last_edited_by")
    val lastEditedBy: EmptyObject?
) : WithDatabaseProperty
