package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * lastEditedTime
 *
 * @author it.motui
 */
data class CreateDatabaseLastEditedTimePropertyRequest(
    override val type: PropertyType = PropertyType.LastEditedTime,
    @JsonProperty("last_edited_time")
    val lastEditedTime: EmptyObject
) : WithCreateDatabaseProperty
