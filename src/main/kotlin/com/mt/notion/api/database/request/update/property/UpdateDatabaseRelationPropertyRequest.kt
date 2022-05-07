package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.PropertyType

/**
 * relation
 *
 * @author it.motui
 */
data class UpdateDatabaseRelationPropertyRequest(
    override val type: PropertyType = PropertyType.Relation,
    override val name: String? = null,
    val relation: DatabaseId
) : WithUpdateDatabaseProperty {
    data class DatabaseId(
        @JsonProperty("database_id")
        val databaseId: String
    )
}
