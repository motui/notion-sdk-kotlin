package com.mt.notion.api.page.response.property.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PageObjectPhoneNumberProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("phone_number")
    val phoneNumber: String?
) : WithPageObjectProperty
