package com.mt.notion.api.database.request.filter.property

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class LastEditedByPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.LastEditedBy,
    @JsonProperty("last_edited_by")
    val lastEditedBy: com.mt.notion.api.database.request.filter.property.condition.PeopleCondition,
) : PropertyFilter
