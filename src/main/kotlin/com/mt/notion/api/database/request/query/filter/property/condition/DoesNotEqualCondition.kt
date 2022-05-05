package com.mt.notion.api.database.request.query.filter.property.condition

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class DoesNotEqualCondition(
    @JsonProperty("does_not_equal")
    val doesNotEqual: String
) : TextCondition,
    SelectCondition