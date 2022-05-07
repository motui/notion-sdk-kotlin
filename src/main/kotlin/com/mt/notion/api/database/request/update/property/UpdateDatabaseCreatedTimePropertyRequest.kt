package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * createdTime
 *
 * @author it.motui
 */
data class UpdateDatabaseCreatedTimePropertyRequest(
    override val type: PropertyType = PropertyType.CreatedTime,
    override val name: String? = null,
    @JsonProperty("created_time")
    val createdTime: EmptyObject
) : WithUpdateDatabaseProperty
