package com.mt.notion.api.database.request.filter.property.condition.date

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class OnOrBeforeCondition(
    @JsonProperty("on_or_after")
    val onOrAfter: String
) : com.mt.notion.api.database.request.filter.property.condition.date.DateCondition