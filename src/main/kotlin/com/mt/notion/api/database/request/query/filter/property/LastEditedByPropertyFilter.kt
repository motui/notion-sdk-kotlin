package com.mt.notion.api.database.request.query.filter.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.query.filter.property.condition.PeopleCondition

/**
 *
 * @author it.motui
 */
data class LastEditedByPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.LastEditedBy,
    @JsonProperty("last_edited_by")
    val lastEditedBy: PeopleCondition,
) : PropertyFilter
