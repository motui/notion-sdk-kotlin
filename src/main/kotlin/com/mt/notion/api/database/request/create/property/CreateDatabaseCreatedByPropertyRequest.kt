package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * CreatedBy
 *
 * @author it.motui
 */
data class CreateDatabaseCreatedByPropertyRequest(
    override val type: PropertyType = PropertyType.CreatedBy,
    @JsonProperty("created_by")
    val createdBy: EmptyObject
) : WithCreateDatabaseProperty
