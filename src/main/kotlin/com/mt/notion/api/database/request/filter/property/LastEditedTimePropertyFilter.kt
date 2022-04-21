package com.mt.notion.api.database.request.filter.property

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class LastEditedTimePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.LastEditedTime,
    @JsonProperty("last_edited_time")
    val lastEditedTime: com.mt.notion.api.database.request.filter.property.condition.date.DateCondition,
) : PropertyFilter
