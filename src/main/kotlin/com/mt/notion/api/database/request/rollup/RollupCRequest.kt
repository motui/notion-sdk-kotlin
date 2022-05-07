package com.mt.notion.api.database.request.rollup

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.RollupFunction

/**
 *
 * @author it.motui
 */
data class RollupCRequest(
    @JsonProperty("relation_property_name")
    val relationPropertyName: String,
    @JsonProperty("rollup_property_id")
    val rollupPropertyId: String,
    val function: RollupFunction,
    @JsonProperty("rollup_property_name")
    val rollupPropertyName: String? = null,
    @JsonProperty("relation_property_id")
    val relationPropertyId: String? = null
) : WithRollupRequest