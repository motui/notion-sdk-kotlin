package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PageLastEditedTimeProperty(
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("last_edited_time")
    val lastEditedTime: String
) : WithPageProperty
