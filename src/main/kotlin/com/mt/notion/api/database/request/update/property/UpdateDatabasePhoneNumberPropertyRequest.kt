package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * phone number
 *
 * @author it.motui
 */
data class UpdateDatabasePhoneNumberPropertyRequest(
    override val type: PropertyType = PropertyType.PhoneNumber,
    override val name: String? = null,
    @JsonProperty("phone_number")
    val phoneNumber: EmptyObject
) : WithUpdateDatabaseProperty
