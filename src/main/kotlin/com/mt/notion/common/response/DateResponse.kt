package com.mt.notion.common.response

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Date response
 *
 * @author it.motui
 */
data class DateResponse(
    val start: String,
    val end: String? = null,
    @JsonProperty("time_zone")
    val timeZone: String? = null,
)
