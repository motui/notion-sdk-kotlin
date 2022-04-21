package com.mt.notion.api.database.request.filter.property.condition

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class DoesNotEqualCondition(
    @JsonProperty("does_not_equal")
    val doesNotEqual: String
) : com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
    com.mt.notion.api.database.request.filter.property.condition.SelectCondition