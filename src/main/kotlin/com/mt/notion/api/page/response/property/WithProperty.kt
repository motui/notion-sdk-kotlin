package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.PropertyType

/**
 * todo 兼容String类型
 * @author it.motui
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(RichTextProperty::class, name = "rich_text"),
    JsonSubTypes.Type(NumberProperty::class, name = "number"),
    JsonSubTypes.Type(SelectProperty::class, name = "select"),
    JsonSubTypes.Type(MultiSelectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(DateProperty::class, name = "date"),
    JsonSubTypes.Type(FormulaProperty::class, name = "formula"),
    JsonSubTypes.Type(RelationProperty::class, name = "relation"),
    JsonSubTypes.Type(RollupProperty::class, name = "rollup"),
    JsonSubTypes.Type(TitleProperty::class, name = "title"),
    JsonSubTypes.Type(PeopleProperty::class, name = "people"),
    JsonSubTypes.Type(FilesProperty::class, name = "files"),
    JsonSubTypes.Type(CheckboxProperty::class, name = "checkbox"),
    JsonSubTypes.Type(UrlProperty::class, name = "url"),
    JsonSubTypes.Type(EmailProperty::class, name = "email"),
    JsonSubTypes.Type(PhoneNumberProperty::class, name = "phone_number"),
    JsonSubTypes.Type(CreatedByProperty::class, name = "created_time"),
    JsonSubTypes.Type(CreatedByProperty::class, name = "created_by"),
    JsonSubTypes.Type(LastEditedTimeProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(LastEditedByProperty::class, name = "last_edited_by")
)
interface WithProperty {
    val type: PropertyType
    val id: String
}