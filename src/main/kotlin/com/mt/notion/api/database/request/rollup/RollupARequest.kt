package com.mt.notion.api.database.request.rollup

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.RollupFunction

/**
 *
 * @author it.motui
 */
data class RollupARequest(
    @JsonProperty("rollup_property_name")
    val rollupPropertyName: String,
    @JsonProperty("relation_property_name")
    val relationPropertyName: String,
    val function: RollupFunction,
    @JsonProperty("rollup_property_id")
    val rollupPropertyId: String? = null,
    @JsonProperty("relation_property_id")
    val relationPropertyId: String? = null
) : WithRollupRequest