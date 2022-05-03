package com.mt.notion.api.database.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * CreditBy
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class DatabaseCreatedByProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("created_by")
    val createdBy: EmptyObject?
) : WithDatabaseProperty
