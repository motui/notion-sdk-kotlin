package com.mt.notion.api.database.request.create.property.rollup

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.RollupFunction

/**
 *
 * @author it.motui
 */
data class RollupDRequest(
    @JsonProperty("rollup_property_id")
    val rollupPropertyId: String,
    @JsonProperty("relation_property_id")
    val relationPropertyId: String,
    val function: RollupFunction,
    @JsonProperty("rollup_property_name")
    val rollupPropertyName: String? = null,
    @JsonProperty("relation_property_name")
    val relationPropertyName: String? = null
) : WithRollupRequest