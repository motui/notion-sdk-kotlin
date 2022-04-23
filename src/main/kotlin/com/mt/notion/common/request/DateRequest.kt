package com.mt.notion.common.request

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Date request
 *
 * @author it.motui
 */
data class DateRequest(
    val start: String,
    val end: String? = null,
    @JsonProperty("time_zone")
    val timeZone: String? = null,
)
