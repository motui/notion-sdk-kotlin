package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
data class DateResponse(
    val start: String,
    val end: String?,
    // todo timeZone 枚举配置
    @JsonProperty("time_zone")
    val timeZone: String?
)
