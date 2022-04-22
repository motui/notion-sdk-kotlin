package com.mt.notion.api.database.request.filter.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.property.condition.MultiSelectCondition

/**
 *
 * @author it.motui
 */
data class MultiSelectPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.MultiSelect,
    @JsonProperty("multi_select")
    val multiSelect: MultiSelectCondition,
) : PropertyFilter
