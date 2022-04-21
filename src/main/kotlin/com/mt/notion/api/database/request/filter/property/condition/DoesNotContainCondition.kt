package com.mt.notion.api.database.request.filter.property.condition

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class DoesNotContainCondition(
    @JsonProperty("does_not_contain")
    val doesNotContain: String
) : com.mt.notion.api.database.request.filter.property.condition.text.TextCondition,
    com.mt.notion.api.database.request.filter.property.condition.MultiSelectCondition,
    com.mt.notion.api.database.request.filter.property.condition.PeopleCondition,
    com.mt.notion.api.database.request.filter.property.condition.RelationCondition