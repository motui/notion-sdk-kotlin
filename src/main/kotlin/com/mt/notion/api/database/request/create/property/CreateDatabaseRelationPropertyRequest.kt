package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 * relation
 *
 * @author it.motui
 */
data class CreateDatabaseRelationPropertyRequest(
    override val type: PropertyType = PropertyType.Relation,
    val relation: DatabaseId
) : WithCreateDatabaseProperty {
    data class DatabaseId(
        @JsonProperty("database_id")
        val databaseId: String
    )
}
