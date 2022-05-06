package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * phone number
 *
 * @author it.motui
 */
data class CreateDatabasePhoneNumberPropertyRequest(
    override val type: PropertyType = PropertyType.PhoneNumber,
    @JsonProperty("phone_number")
    val phoneNumber: EmptyObject
) : WithCreateDatabaseProperty
