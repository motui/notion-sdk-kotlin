package com.mt.notion.api.database.request.query.filter.property.condition.number

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class DoesNotEqualCondition(
    @JsonProperty("does_not_equal")
    val doesNotEqual: Number
) : NumberCondition