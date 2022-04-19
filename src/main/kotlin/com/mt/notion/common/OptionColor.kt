package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Select option color
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object#select-options">Select options</a>
 */
enum class OptionColor constructor(val value: String) {
    @JsonProperty("default")
    Default("default"),

    @JsonProperty("gray")
    Gray("gray"),

    @JsonProperty("brown")
    Brown("brown"),

    @JsonProperty("orange")
    Orange("orange"),

    @JsonProperty("yellow")
    Yellow("yellow"),

    @JsonProperty("green")
    Green("green"),

    @JsonProperty("blue")
    Blue("blue"),

    @JsonProperty("purple")
    Purple("purple"),

    @JsonProperty("pink")
    Pink("pink"),

    @JsonProperty("red")
    Red("red");

    override fun toString(): String = value
}
