package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreatedByProperty(
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("created_by")
    val createdBy: User
) : WithProperty