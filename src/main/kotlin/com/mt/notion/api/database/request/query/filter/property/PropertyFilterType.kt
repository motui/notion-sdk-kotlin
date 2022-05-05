package com.mt.notion.api.database.request.query.filter.property

/**
 *
 * @author it.motui
 */
enum class PropertyFilterType constructor(private val value: String) {
    Title("title"),
    RichText("rich_text"),
    Number("number"),
    Checkbox("checkbox"),
    Select("select"),
    MultiSelect("multi_select"),
    Date("date"),
    People("people"),
    Files("files"),
    Url("url"),
    Email("email"),
    PhoneNumber("phone_number"),
    Relation("relation"),
    CreatedBy("created_by"),
    CreatedTime("created_time"),
    LastEditedBy("last_edited_by"),
    LastEditedTime("last_edited_time"),
    Formula("formula"),
    Rollup("rollup"),
    ;

    override fun toString(): String = value
}