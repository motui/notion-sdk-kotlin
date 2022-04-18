package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Select
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class CreatedByProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("created_by")
    val createdBy: EmptyObject?
) : DatabaseProperty