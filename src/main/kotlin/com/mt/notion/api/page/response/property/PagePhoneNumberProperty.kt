package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PagePhoneNumberProperty(
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("phone_number")
    val phoneNumber: String?
) : WithPageProperty
