package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class RollupSubMultiSelectCondition(
    @JsonProperty("multi_select")
    val multiSelect: com.mt.notion.api.database.request.filter.property.condition.MultiSelectCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
