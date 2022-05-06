package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * createdTime
 *
 * @author it.motui
 */
data class CreateDatabaseCreatedTimePropertyRequest(
    override val type: PropertyType = PropertyType.CreatedTime,
    @JsonProperty("created_time")
    val createdTime: EmptyObject
) : WithCreateDatabaseProperty
