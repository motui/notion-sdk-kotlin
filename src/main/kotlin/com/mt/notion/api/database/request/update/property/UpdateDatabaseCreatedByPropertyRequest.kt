package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * CreatedBy
 *
 * @author it.motui
 */
data class UpdateDatabaseCreatedByPropertyRequest(
    override val type: PropertyType = PropertyType.CreatedBy,
    override val name: String? = null,
    @JsonProperty("created_by")
    val createdBy: EmptyObject
) : WithUpdateDatabaseProperty
