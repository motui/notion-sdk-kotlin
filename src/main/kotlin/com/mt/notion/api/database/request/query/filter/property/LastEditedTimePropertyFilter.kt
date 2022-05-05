package com.mt.notion.api.database.request.query.filter.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.query.filter.property.condition.date.DateCondition

/**
 *
 * @author it.motui
 */
data class LastEditedTimePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.LastEditedTime,
    @JsonProperty("last_edited_time")
    val lastEditedTime: DateCondition,
) : PropertyFilter
