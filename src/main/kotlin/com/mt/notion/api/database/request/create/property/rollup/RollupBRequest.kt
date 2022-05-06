package com.mt.notion.api.database.request.create.property.rollup

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.RollupFunction

/**
 *
 * @author it.motui
 */
data class RollupBRequest(
    @JsonProperty("rollup_property_name")
    val rollupPropertyName: String,
    @JsonProperty("relation_property_id")
    val relationPropertyId: String,
    val function: RollupFunction,
    @JsonProperty("relation_property_name")
    val relationPropertyName: String? = null,
    @JsonProperty("rollup_property_id")
    val rollupPropertyId: String? = null,
) : WithRollupRequest