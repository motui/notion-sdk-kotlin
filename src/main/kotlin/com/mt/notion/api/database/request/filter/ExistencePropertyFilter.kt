package com.mt.notion.api.database.request.filter

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class ExistencePropertyFilter(
    @JsonProperty("is_empty")
    val isEmpty: Boolean,
    @JsonProperty("is_not_empty")
    val isNotEmpty: Boolean
)
