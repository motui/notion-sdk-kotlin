package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * lastEditedBy
 *
 * @author it.motui
 */
data class UpdateDatabaseLastEditedByPropertyRequest(
    override val type: PropertyType = PropertyType.LastEditedBy,
    override val name: String? = null,
    @JsonProperty("last_edited_by")
    val lastEditedBy: EmptyObject
) : WithUpdateDatabaseProperty
