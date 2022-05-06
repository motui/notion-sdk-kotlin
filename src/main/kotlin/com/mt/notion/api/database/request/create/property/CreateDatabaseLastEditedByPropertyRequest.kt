package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * lastEditedBy
 *
 * @author it.motui
 */
data class CreateDatabaseLastEditedByPropertyRequest(
    override val type: PropertyType = PropertyType.LastEditedBy,
    @JsonProperty("last_edited_by")
    val lastEditedBy: EmptyObject
) : WithCreateDatabaseProperty
