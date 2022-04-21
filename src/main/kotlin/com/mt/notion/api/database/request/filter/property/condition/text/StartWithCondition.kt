package com.mt.notion.api.database.request.filter.property.condition.text

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class StartWithCondition(
    @JsonProperty("starts_with")
    val startsWith: String
) : com.mt.notion.api.database.request.filter.property.condition.text.TextCondition