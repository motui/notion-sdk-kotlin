package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * lastEditedTime
 *
 * @author it.motui
 */
data class UpdateDatabaseLastEditedTimePropertyRequest(
    override val type: PropertyType = PropertyType.LastEditedTime,
    override val name: String? = null,
    @JsonProperty("last_edited_time")
    val lastEditedTime: EmptyObject
) : WithUpdateDatabaseProperty
