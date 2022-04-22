package com.mt.notion.api.database.request.filter.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.filter.property.condition.PeopleCondition

/**
 *
 * @author it.motui
 */
data class CreatedByPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.CreatedBy,
    @JsonProperty("created_by")
    val createdBy: PeopleCondition,
) : PropertyFilter
