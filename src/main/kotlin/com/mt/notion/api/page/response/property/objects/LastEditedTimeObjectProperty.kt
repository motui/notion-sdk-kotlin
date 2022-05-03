package com.mt.notion.api.page.response.property.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class LastEditedTimeObjectProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("last_edited_time")
    val lastEditedTime: String
) : WithObjectProperty
