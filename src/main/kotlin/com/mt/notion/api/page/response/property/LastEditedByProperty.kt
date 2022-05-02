package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class LastEditedByProperty(
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("last_edited_by")
    val lastEditedBy: User
) : WithProperty
