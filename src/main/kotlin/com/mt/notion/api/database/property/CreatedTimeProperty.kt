package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Select
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class CreatedTimeProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("created_time")
    val createdTime: EmptyObject?
) : DatabaseProperty
