package com.mt.notion.api.database.request.filter.property

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class MultiSelectPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.MultiSelect,
    @JsonProperty("multi_select")
    val multiSelect: com.mt.notion.api.database.request.filter.property.condition.MultiSelectCondition,
) : PropertyFilter
