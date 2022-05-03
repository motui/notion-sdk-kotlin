package com.mt.notion.api.database.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.RollupFunction

/**
 * Rollup
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseRollupProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val rollup: Rollup
) : WithDatabaseProperty {

    data class Rollup(
        /**
         * The name of the relation property this property is responsible for rolling up.
         */
        @JsonProperty("relation_property_name")
        val relationPropertyName: String,
        /**
         * The id of the relation property this property is responsible for rolling up.
         */
        @JsonProperty("relation_property_id")
        val relationPropertyId: String,
        /**
         * The name of the property of the pages in the related database that is used as an input to function.
         */
        @JsonProperty("rollup_property_name")
        val rollupPropertyName: String,
        /**
         * The id of the property of the pages in the related database that is used as an input to function.
         */
        @JsonProperty("rollup_property_id")
        val rollupPropertyId: String,
        /**
         * The function that is evaluated for every page in the relation of the rollup.
         */
        val function: RollupFunction
    )

}
