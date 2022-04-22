package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 * relation
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class RelationProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val relation: Relation
) : DatabaseProperty {

    data class Relation(
        /**
         * The database this relation refers to. New linked pages must belong to this database in order to be valid.
         */
        @JsonProperty("database_id")
        val databaseId: String,

        /**
         * By default, relations are formed as two synced properties across databases: if you make a change to one property,
         * it updates the synced property at the same time. synced_property_name refers to the name of
         * the property in the related database.
         */
        @JsonProperty("synced_property_name")
        val syncedPropertyName: String? = null,

        /**
         * By default, relations are formed as two synced properties across databases: if you make a change to one property,
         * it updates the synced property at the same time. synced_property_id refers to the id of the property in the
         * related database. This is usually a short string of random letters and symbols.
         */
        @JsonProperty("synced_property_id")
        val syncedPropertyId: String? = null
    )
}
