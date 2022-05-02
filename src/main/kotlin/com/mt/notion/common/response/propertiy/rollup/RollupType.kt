package com.mt.notion.common.response.propertiy.rollup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
enum class RollupType constructor(val value: String) {

    @JsonProperty("array")
    Array("array"),

    @JsonProperty("date")
    Date("date"),

    @JsonProperty("number")
    Number("number"),

    ;

    override fun toString(): String = value
}