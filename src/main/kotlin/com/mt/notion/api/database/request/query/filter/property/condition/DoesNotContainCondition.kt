package com.mt.notion.api.database.request.query.filter.property.condition

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class DoesNotContainCondition(
    @JsonProperty("does_not_contain")
    val doesNotContain: String
) : TextCondition,
    MultiSelectCondition,
    PeopleCondition,
    RelationCondition