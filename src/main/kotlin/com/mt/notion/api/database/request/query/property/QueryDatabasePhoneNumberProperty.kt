package com.mt.notion.api.database.request.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 * phone number
 *
 * @author it.motui
 */
data class QueryDatabasePhoneNumberProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("phone_number")
    val phoneNumber: String?
) : WithQueryDatabaseProperty
