package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Property Type
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
enum class PropertyType constructor(val value: String) {
    @JsonProperty("rich_text")
    RichText("rich_text"),

    @JsonProperty("number")
    Number("number"),

    @JsonProperty("select")
    Select("select"),

    @JsonProperty("multi_select")
    MultiSelect("multi_select"),

    @JsonProperty("date")
    Date("date"),

    @JsonProperty("formula")
    Formula("formula"),

    @JsonProperty("relation")
    Relation("relation"),

    @JsonProperty("rollup")
    Rollup("rollup"),

    @JsonProperty("title")
    Title("title"),

    @JsonProperty("people")
    People("people"),

    @JsonProperty("files")
    Files("files"),

    @JsonProperty("checkbox")
    Checkbox("checkbox"),

    @JsonProperty("url")
    Url("url"),

    @JsonProperty("email")
    Email("email"),

    @JsonProperty("phone_number")
    PhoneNumber("phone_number"),

    @JsonProperty("created_time")
    CreatedTime("created_time"),

    @JsonProperty("created_by")
    CreatedBy("created_by"),

    @JsonProperty("last_edited_time")
    LastEditedTime("last_edited_time"),

    @JsonProperty("last_edited_by")
    LastEditedBy("last_edited_by"),

    @JsonProperty("property_item")
    PropertyItem("property_item");

    override fun toString(): String = value
}
