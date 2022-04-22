package com.mt.notion.api.database.request.filter.property.condition.text

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class EndsWithCondition(
    @JsonProperty("ends_with")
    val endsWith: String
) : TextCondition