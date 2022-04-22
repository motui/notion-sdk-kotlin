package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.property.condition.MultiSelectCondition

/**
 *
 * @author it.motui
 */
data class RollupSubMultiSelectCondition(
    @JsonProperty("multi_select")
    val multiSelect: MultiSelectCondition
) : RollupSubCondition
