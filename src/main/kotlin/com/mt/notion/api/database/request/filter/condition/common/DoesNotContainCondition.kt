package com.mt.notion.api.database.request.filter.condition.common

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.condition.MultiSelectCondition
import com.mt.notion.api.database.request.filter.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class DoesNotContainCondition(
    @JsonProperty("does_not_contain")
    val doesNotContain: String
) : TextCondition, MultiSelectCondition