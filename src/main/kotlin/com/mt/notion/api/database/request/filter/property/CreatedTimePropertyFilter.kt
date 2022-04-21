package com.mt.notion.api.database.request.filter.property

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class CreatedTimePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.CreatedTime,
    @JsonProperty("created_time")
    val createdTime: com.mt.notion.api.database.request.filter.property.condition.date.DateCondition,
) : PropertyFilter
