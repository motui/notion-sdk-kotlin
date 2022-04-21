package com.mt.notion.api.database.request.filter.property.condition.date

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class OnOrAfterCondition(
    @JsonProperty("on_or_before")
    val onOrBefore: String
) : com.mt.notion.api.database.request.filter.property.condition.date.DateCondition