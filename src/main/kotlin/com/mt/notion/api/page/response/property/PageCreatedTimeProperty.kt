package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PageCreatedTimeProperty(
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("created_time")
    val createdTime: String
) : WithPageProperty
