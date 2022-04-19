package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 * Select
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class RollupProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val rollup: Rollup
) : DatabaseProperty {

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
        val function: Function
    )

    enum class Function constructor(private val value: String) {
        @JsonProperty("count_all")
        CountAll("count_all"),

        @JsonProperty("count_values")
        CountValues("count_values"),

        @JsonProperty("count_unique_values")
        CountUniqueValues("count_unique_values"),

        @JsonProperty("count_empty")
        CountEmpty("count_empty"),

        @JsonProperty("count_not_empty")
        CountNotEmpty("count_not_empty"),

        @JsonProperty("percent_empty")
        PercentEmpty("percent_empty"),

        @JsonProperty("percent_not_empty")
        PercentNotEmpty("percent_not_empty"),

        @JsonProperty("sum")
        Sum("sum"),

        @JsonProperty("average")
        Average("average"),

        @JsonProperty("median")
        Median("median"),

        @JsonProperty("min")
        Min("min"),

        @JsonProperty("max")
        Max("max"),

        @JsonProperty("range")
        Range("range"),

        @JsonProperty("show_original")
        ShowOriginal("show_original"),

        ;

        override fun toString(): String = value
    }
}
