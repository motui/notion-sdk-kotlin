package com.mt.notion.api.database.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * phone number
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class PhoneNumberProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("phone_number")
    val phoneNumber: EmptyObject?
) : DatabaseProperty
