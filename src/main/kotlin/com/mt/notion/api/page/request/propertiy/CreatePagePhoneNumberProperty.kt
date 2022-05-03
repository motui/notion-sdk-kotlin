package com.mt.notion.api.page.request.propertiy

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreatePagePhoneNumberProperty(
    override val type: PropertyType = PropertyType.PhoneNumber,
    @JsonProperty("phone_number")
    val phoneNumber: String? = null
) : WithCreatePageProperty
