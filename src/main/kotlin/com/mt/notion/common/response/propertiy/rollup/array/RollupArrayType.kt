package com.mt.notion.common.response.propertiy.rollup.array

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
enum class RollupArrayType constructor(val value: String) {

    @JsonProperty("title")
    Title("title"),

    @JsonProperty("rich_text")
    RichText("rich_text"),

    @JsonProperty("people")
    People("people"),

    @JsonProperty("relation")
    Relation("relation"),

    ;

    override fun toString(): String = value
}