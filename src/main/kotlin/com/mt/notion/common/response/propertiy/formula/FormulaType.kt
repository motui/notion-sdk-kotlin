package com.mt.notion.common.response.propertiy.formula

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
enum class FormulaType constructor(val value: String) {

    @JsonProperty("string")
    StringType("string"),

    @JsonProperty("date")
    Date("date"),

    @JsonProperty("number")
    Number("number"),

    @JsonProperty("boolean")
    Boolean("boolean")
    ;

    override fun toString(): String = value
}